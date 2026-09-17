package androidx.datastore.preferences;

/* compiled from: PreferenceDataStoreDelegate.kt */
/* loaded from: classes.dex */
public final class PreferenceDataStoreSingletonDelegate implements kotlin.properties.ReadOnlyProperty<android.content.Context, androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences>> {
    private volatile androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> INSTANCE;
    private final androidx.datastore.core.handlers.ReplaceFileCorruptionHandler<androidx.datastore.preferences.core.Preferences> corruptionHandler;
    private final java.lang.Object lock;
    private final java.lang.String name;
    private final kotlin.jvm.functions.Function1<android.content.Context, java.util.List<androidx.datastore.core.DataMigration<androidx.datastore.preferences.core.Preferences>>> produceMigrations;
    private final kotlinx.coroutines.CoroutineScope scope;

    public PreferenceDataStoreSingletonDelegate(java.lang.String r2, androidx.datastore.core.handlers.ReplaceFileCorruptionHandler<androidx.datastore.preferences.core.Preferences> r3, kotlin.jvm.functions.Function1<? super android.content.Context, ? extends java.util.List<? extends androidx.datastore.core.DataMigration<androidx.datastore.preferences.core.Preferences>>> r4, kotlinx.coroutines.CoroutineScope r5) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "produceMigrations"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r1.<init>()
            r1.name = r2
            r1.corruptionHandler = r3
            r1.produceMigrations = r4
            r1.scope = r5
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.lock = r2
            return
    }

    public static final /* synthetic */ java.lang.String access$getName$p(androidx.datastore.preferences.PreferenceDataStoreSingletonDelegate r0) {
            java.lang.String r0 = r0.name
            return r0
    }

    /* renamed from: getValue, reason: avoid collision after fix types in other method */
    public androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> getValue2(android.content.Context r6, kotlin.reflect.KProperty<?> r7) {
            r5 = this;
            java.lang.String r0 = "thisRef"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "property"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> r7 = r5.INSTANCE
            if (r7 != 0) goto L42
            java.lang.Object r7 = r5.lock
            monitor-enter(r7)
            androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> r0 = r5.INSTANCE     // Catch: java.lang.Throwable -> L3f
            if (r0 != 0) goto L37
            android.content.Context r6 = r6.getApplicationContext()     // Catch: java.lang.Throwable -> L3f
            androidx.datastore.preferences.core.PreferenceDataStoreFactory r0 = androidx.datastore.preferences.core.PreferenceDataStoreFactory.INSTANCE     // Catch: java.lang.Throwable -> L3f
            androidx.datastore.core.handlers.ReplaceFileCorruptionHandler<androidx.datastore.preferences.core.Preferences> r1 = r5.corruptionHandler     // Catch: java.lang.Throwable -> L3f
            kotlin.jvm.functions.Function1<android.content.Context, java.util.List<androidx.datastore.core.DataMigration<androidx.datastore.preferences.core.Preferences>>> r2 = r5.produceMigrations     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = "applicationContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r3)     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r2 = r2.invoke(r6)     // Catch: java.lang.Throwable -> L3f
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L3f
            kotlinx.coroutines.CoroutineScope r3 = r5.scope     // Catch: java.lang.Throwable -> L3f
            androidx.datastore.preferences.PreferenceDataStoreSingletonDelegate$getValue$1$1 r4 = new androidx.datastore.preferences.PreferenceDataStoreSingletonDelegate$getValue$1$1     // Catch: java.lang.Throwable -> L3f
            r4.<init>(r6, r5)     // Catch: java.lang.Throwable -> L3f
            androidx.datastore.core.DataStore r6 = r0.create(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L3f
            r5.INSTANCE = r6     // Catch: java.lang.Throwable -> L3f
        L37:
            androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> r6 = r5.INSTANCE     // Catch: java.lang.Throwable -> L3f
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r7)
            r7 = r6
            goto L42
        L3f:
            r6 = move-exception
            monitor-exit(r7)
            throw r6
        L42:
            return r7
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> getValue(android.content.Context r1, kotlin.reflect.KProperty r2) {
            r0 = this;
            android.content.Context r1 = (android.content.Context) r1
            androidx.datastore.core.DataStore r1 = r0.getValue2(r1, r2)
            return r1
    }
}
