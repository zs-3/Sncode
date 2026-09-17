package androidx.datastore.preferences;

/* compiled from: PreferenceDataStoreFile.kt */
/* loaded from: classes.dex */
public final class PreferenceDataStoreFile {
    public static final java.io.File preferencesDataStoreFile(android.content.Context r1, java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = ".preferences_pb"
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r0)
            java.io.File r1 = androidx.datastore.DataStoreFile.dataStoreFile(r1, r2)
            return r1
    }
}
