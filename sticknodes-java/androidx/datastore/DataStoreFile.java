package androidx.datastore;

/* compiled from: DataStoreFile.kt */
/* loaded from: classes.dex */
public final class DataStoreFile {
    public static final java.io.File dataStoreFile(android.content.Context r2, java.lang.String r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "fileName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.io.File r0 = new java.io.File
            android.content.Context r2 = r2.getApplicationContext()
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r1 = "datastore/"
            java.lang.String r3 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r3)
            r0.<init>(r2, r3)
            return r0
    }
}
