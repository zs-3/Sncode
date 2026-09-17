package androidx.datastore.core;

/* compiled from: DataStoreFactory.kt */
/* loaded from: classes.dex */
public final class DataStoreFactory {
    public static final androidx.datastore.core.DataStoreFactory INSTANCE = null;

    static {
            androidx.datastore.core.DataStoreFactory r0 = new androidx.datastore.core.DataStoreFactory
            r0.<init>()
            androidx.datastore.core.DataStoreFactory.INSTANCE = r0
            return
    }

    private DataStoreFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public final <T> androidx.datastore.core.DataStore<T> create(androidx.datastore.core.Serializer<T> r7, androidx.datastore.core.handlers.ReplaceFileCorruptionHandler<T> r8, java.util.List<? extends androidx.datastore.core.DataMigration<T>> r9, kotlinx.coroutines.CoroutineScope r10, kotlin.jvm.functions.Function0<? extends java.io.File> r11) {
            r6 = this;
            java.lang.String r0 = "serializer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "migrations"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "produceFile"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            if (r8 != 0) goto L1b
            androidx.datastore.core.handlers.NoOpCorruptionHandler r8 = new androidx.datastore.core.handlers.NoOpCorruptionHandler
            r8.<init>()
        L1b:
            r4 = r8
            androidx.datastore.core.DataMigrationInitializer$Companion r8 = androidx.datastore.core.DataMigrationInitializer.Companion
            kotlin.jvm.functions.Function2 r8 = r8.getInitializer(r9)
            java.util.List r3 = kotlin.collections.CollectionsKt.listOf(r8)
            androidx.datastore.core.SingleProcessDataStore r8 = new androidx.datastore.core.SingleProcessDataStore
            r0 = r8
            r1 = r11
            r2 = r7
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return r8
    }
}
