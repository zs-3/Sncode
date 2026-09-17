package androidx.datastore.preferences.core;

/* compiled from: PreferenceDataStoreFactory.kt */
/* loaded from: classes.dex */
public final class PreferenceDataStoreFactory {
    public static final androidx.datastore.preferences.core.PreferenceDataStoreFactory INSTANCE = null;

    static {
            androidx.datastore.preferences.core.PreferenceDataStoreFactory r0 = new androidx.datastore.preferences.core.PreferenceDataStoreFactory
            r0.<init>()
            androidx.datastore.preferences.core.PreferenceDataStoreFactory.INSTANCE = r0
            return
    }

    private PreferenceDataStoreFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> create(androidx.datastore.core.handlers.ReplaceFileCorruptionHandler<androidx.datastore.preferences.core.Preferences> r8, java.util.List<? extends androidx.datastore.core.DataMigration<androidx.datastore.preferences.core.Preferences>> r9, kotlinx.coroutines.CoroutineScope r10, kotlin.jvm.functions.Function0<? extends java.io.File> r11) {
            r7 = this;
            java.lang.String r0 = "migrations"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "produceFile"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            androidx.datastore.core.DataStoreFactory r1 = androidx.datastore.core.DataStoreFactory.INSTANCE
            androidx.datastore.preferences.core.PreferencesSerializer r2 = androidx.datastore.preferences.core.PreferencesSerializer.INSTANCE
            androidx.datastore.preferences.core.PreferenceDataStoreFactory$create$delegate$1 r6 = new androidx.datastore.preferences.core.PreferenceDataStoreFactory$create$delegate$1
            r6.<init>(r11)
            r3 = r8
            r4 = r9
            r5 = r10
            androidx.datastore.core.DataStore r8 = r1.create(r2, r3, r4, r5, r6)
            androidx.datastore.preferences.core.PreferenceDataStore r9 = new androidx.datastore.preferences.core.PreferenceDataStore
            r9.<init>(r8)
            return r9
    }
}
