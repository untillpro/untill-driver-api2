# Finger Print Preader - IFingerPrintReader

```java
public interface IFingerPrintReader extends IDriverInterface {

    FprReadAndEnrollResult readAndEnroll(DriverConfiguration cfg,
            FprReadAndEnrollRequest request);

    FprReadAndIdentificateResult readAndIdentificate(DriverConfiguration cfg,
            FprReadAndIdentiticateRequest request);

}
```

## Enrolling fingerprints 
`readAndEnroll` - called by unTill(r) Backoffice when operator adds a new fingerprint to certain user. Driver must handle fingerprint reading and return fingerprint data in `FprReadAndEnrollResult.data` byte array. This data is then stored in unTill(r) database.
In case when reading is interrupted by user, function returns empty `FprReadAndEnrollResult.data` array.

## Identifying users
When unTill(r) POS launched it starts calling `readAndIdentificate` in a loop, passing certain timeout in `FprReadAndIdentiticateRequest`. Driver must keep waiting for a fingerprint during this timeout. 
- As soon as fingerprint read, driver uses `IUntillFingerprintsApi` API to read all fingerprints from database (API returns list of `UntillFingerprint` object with userId and data properties). Driver then compares fingerprint which is read with the list from database and if match found, it returns userId in `FprReadAndIdentificateResult`.
- If no match found, or no fingerprint read during timeout, driver returns `FprReadAndIdentificateResult` with null as userId.

## Stopping reading
Driver must support [IDriverProgress](progress.md) to check if the request is stopped from unTill side. In this case driver must stop waiting for a fingerprint and return. Both `readAndEnroll` and `readAndIdentificate` must support this and react as soon as possible when cancel is requested.
