package androidx.datastore.preferences;

/* compiled from: PreferenceDataStoreDelegate.kt */
/* loaded from: classes.dex */
public final class PreferenceDataStoreDelegateKt {


    public static final kotlin.properties.ReadOnlyProperty<android.content.Context, androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences>> preferencesDataStore(java.lang.String r1, androidx.datastore.core.handlers.ReplaceFileCorruptionHandler<androidx.datastore.preferences.core.Preferences> r2, kotlin.jvm.functions.Function1<? super android.content.Context, ? extends java.util.List<? extends androidx.datastore.core.DataMigration<androidx.datastore.preferences.core.Preferences>>> r3, kotlinx.coroutines.CoroutineScope r4) {
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "produceMigrations"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.datastore.preferences.PreferenceDataStoreSingletonDelegate r0 = new androidx.datastore.preferences.PreferenceDataStoreSingletonDelegate
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public static /* synthetic */ kotlin.properties.ReadOnlyProperty preferencesDataStore$default(java.lang.String r1, androidx.datastore.core.handlers.ReplaceFileCorruptionHandler r2, kotlin.jvm.functions.Function1 r3, kotlinx.coroutines.CoroutineScope r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r2 = r0
        L6:
            r6 = r5 & 4
            if (r6 == 0) goto Lc
            androidx.datastore.preferences.PreferenceDataStoreDelegateKt$preferencesDataStore$1 r3 = androidx.datastore.preferences.PreferenceDataStoreDelegateKt.AnonymousClass1.INSTANCE
        Lc:
            r5 = r5 & 8
            if (r5 == 0) goto L23
            kotlinx.coroutines.Dispatchers r4 = kotlinx.coroutines.Dispatchers.INSTANCE
            kotlinx.coroutines.CoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.getIO()
            r5 = 1
            kotlinx.coroutines.CompletableJob r5 = kotlinx.coroutines.SupervisorKt.SupervisorJob$default(r0, r5, r0)
            kotlin.coroutines.CoroutineContext r4 = r4.plus(r5)
            kotlinx.coroutines.CoroutineScope r4 = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(r4)
        L23:
            kotlin.properties.ReadOnlyProperty r1 = preferencesDataStore(r1, r2, r3, r4)
            return r1
    }
}
