package androidx.work.impl;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends androidx.work.impl.WorkDatabase {
    private volatile androidx.work.impl.model.DependencyDao _dependencyDao;
    private volatile androidx.work.impl.model.PreferenceDao _preferenceDao;
    private volatile androidx.work.impl.model.SystemIdInfoDao _systemIdInfoDao;
    private volatile androidx.work.impl.model.WorkNameDao _workNameDao;
    private volatile androidx.work.impl.model.WorkProgressDao _workProgressDao;
    private volatile androidx.work.impl.model.WorkSpecDao _workSpecDao;
    private volatile androidx.work.impl.model.WorkTagDao _workTagDao;


    public WorkDatabase_Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.util.List access$000(androidx.work.impl.WorkDatabase_Impl r0) {
            java.util.List<androidx.room.RoomDatabase$Callback> r0 = r0.mCallbacks
            return r0
    }

    static /* synthetic */ java.util.List access$100(androidx.work.impl.WorkDatabase_Impl r0) {
            java.util.List<androidx.room.RoomDatabase$Callback> r0 = r0.mCallbacks
            return r0
    }

    static /* synthetic */ java.util.List access$1000(androidx.work.impl.WorkDatabase_Impl r0) {
            java.util.List<androidx.room.RoomDatabase$Callback> r0 = r0.mCallbacks
            return r0
    }

    static /* synthetic */ java.util.List access$200(androidx.work.impl.WorkDatabase_Impl r0) {
            java.util.List<androidx.room.RoomDatabase$Callback> r0 = r0.mCallbacks
            return r0
    }

    static /* synthetic */ java.util.List access$300(androidx.work.impl.WorkDatabase_Impl r0) {
            java.util.List<androidx.room.RoomDatabase$Callback> r0 = r0.mCallbacks
            return r0
    }

    static /* synthetic */ java.util.List access$400(androidx.work.impl.WorkDatabase_Impl r0) {
            java.util.List<androidx.room.RoomDatabase$Callback> r0 = r0.mCallbacks
            return r0
    }

    static /* synthetic */ java.util.List access$500(androidx.work.impl.WorkDatabase_Impl r0) {
            java.util.List<androidx.room.RoomDatabase$Callback> r0 = r0.mCallbacks
            return r0
    }

    static /* synthetic */ androidx.sqlite.db.SupportSQLiteDatabase access$602(androidx.work.impl.WorkDatabase_Impl r0, androidx.sqlite.db.SupportSQLiteDatabase r1) {
            r0.mDatabase = r1
            return r1
    }

    static /* synthetic */ void access$700(androidx.work.impl.WorkDatabase_Impl r0, androidx.sqlite.db.SupportSQLiteDatabase r1) {
            r0.internalInitInvalidationTracker(r1)
            return
    }

    static /* synthetic */ java.util.List access$800(androidx.work.impl.WorkDatabase_Impl r0) {
            java.util.List<androidx.room.RoomDatabase$Callback> r0 = r0.mCallbacks
            return r0
    }

    static /* synthetic */ java.util.List access$900(androidx.work.impl.WorkDatabase_Impl r0) {
            java.util.List<androidx.room.RoomDatabase$Callback> r0 = r0.mCallbacks
            return r0
    }

    @Override // androidx.room.RoomDatabase
    protected androidx.room.InvalidationTracker createInvalidationTracker() {
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 0
            r0.<init>(r1)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>(r1)
            androidx.room.InvalidationTracker r1 = new androidx.room.InvalidationTracker
            java.lang.String r3 = "Dependency"
            java.lang.String r4 = "WorkSpec"
            java.lang.String r5 = "WorkTag"
            java.lang.String r6 = "SystemIdInfo"
            java.lang.String r7 = "WorkName"
            java.lang.String r8 = "WorkProgress"
            java.lang.String r9 = "Preference"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5, r6, r7, r8, r9}
            r1.<init>(r10, r0, r2, r3)
            return r1
    }

    @Override // androidx.room.RoomDatabase
    protected androidx.sqlite.db.SupportSQLiteOpenHelper createOpenHelper(androidx.room.DatabaseConfiguration r5) {
            r4 = this;
            androidx.room.RoomOpenHelper r0 = new androidx.room.RoomOpenHelper
            androidx.work.impl.WorkDatabase_Impl$1 r1 = new androidx.work.impl.WorkDatabase_Impl$1
            r2 = 12
            r1.<init>(r4, r2)
            java.lang.String r2 = "c103703e120ae8cc73c9248622f3cd1e"
            java.lang.String r3 = "49f946663a8deb7054212b8adda248c6"
            r0.<init>(r5, r1, r2, r3)
            android.content.Context r1 = r5.context
            androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration$Builder r1 = androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.builder(r1)
            java.lang.String r2 = r5.name
            androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration$Builder r1 = r1.name(r2)
            androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration$Builder r0 = r1.callback(r0)
            androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration r0 = r0.build()
            androidx.sqlite.db.SupportSQLiteOpenHelper$Factory r5 = r5.sqliteOpenHelperFactory
            androidx.sqlite.db.SupportSQLiteOpenHelper r5 = r5.create(r0)
            return r5
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.DependencyDao dependencyDao() {
            r1 = this;
            androidx.work.impl.model.DependencyDao r0 = r1._dependencyDao
            if (r0 == 0) goto L7
            androidx.work.impl.model.DependencyDao r0 = r1._dependencyDao
            return r0
        L7:
            monitor-enter(r1)
            androidx.work.impl.model.DependencyDao r0 = r1._dependencyDao     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L13
            androidx.work.impl.model.DependencyDao_Impl r0 = new androidx.work.impl.model.DependencyDao_Impl     // Catch: java.lang.Throwable -> L17
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L17
            r1._dependencyDao = r0     // Catch: java.lang.Throwable -> L17
        L13:
            androidx.work.impl.model.DependencyDao r0 = r1._dependencyDao     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            return r0
        L17:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r0
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.PreferenceDao preferenceDao() {
            r1 = this;
            androidx.work.impl.model.PreferenceDao r0 = r1._preferenceDao
            if (r0 == 0) goto L7
            androidx.work.impl.model.PreferenceDao r0 = r1._preferenceDao
            return r0
        L7:
            monitor-enter(r1)
            androidx.work.impl.model.PreferenceDao r0 = r1._preferenceDao     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L13
            androidx.work.impl.model.PreferenceDao_Impl r0 = new androidx.work.impl.model.PreferenceDao_Impl     // Catch: java.lang.Throwable -> L17
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L17
            r1._preferenceDao = r0     // Catch: java.lang.Throwable -> L17
        L13:
            androidx.work.impl.model.PreferenceDao r0 = r1._preferenceDao     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            return r0
        L17:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r0
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.SystemIdInfoDao systemIdInfoDao() {
            r1 = this;
            androidx.work.impl.model.SystemIdInfoDao r0 = r1._systemIdInfoDao
            if (r0 == 0) goto L7
            androidx.work.impl.model.SystemIdInfoDao r0 = r1._systemIdInfoDao
            return r0
        L7:
            monitor-enter(r1)
            androidx.work.impl.model.SystemIdInfoDao r0 = r1._systemIdInfoDao     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L13
            androidx.work.impl.model.SystemIdInfoDao_Impl r0 = new androidx.work.impl.model.SystemIdInfoDao_Impl     // Catch: java.lang.Throwable -> L17
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L17
            r1._systemIdInfoDao = r0     // Catch: java.lang.Throwable -> L17
        L13:
            androidx.work.impl.model.SystemIdInfoDao r0 = r1._systemIdInfoDao     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            return r0
        L17:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r0
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.WorkNameDao workNameDao() {
            r1 = this;
            androidx.work.impl.model.WorkNameDao r0 = r1._workNameDao
            if (r0 == 0) goto L7
            androidx.work.impl.model.WorkNameDao r0 = r1._workNameDao
            return r0
        L7:
            monitor-enter(r1)
            androidx.work.impl.model.WorkNameDao r0 = r1._workNameDao     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L13
            androidx.work.impl.model.WorkNameDao_Impl r0 = new androidx.work.impl.model.WorkNameDao_Impl     // Catch: java.lang.Throwable -> L17
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L17
            r1._workNameDao = r0     // Catch: java.lang.Throwable -> L17
        L13:
            androidx.work.impl.model.WorkNameDao r0 = r1._workNameDao     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            return r0
        L17:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r0
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.WorkProgressDao workProgressDao() {
            r1 = this;
            androidx.work.impl.model.WorkProgressDao r0 = r1._workProgressDao
            if (r0 == 0) goto L7
            androidx.work.impl.model.WorkProgressDao r0 = r1._workProgressDao
            return r0
        L7:
            monitor-enter(r1)
            androidx.work.impl.model.WorkProgressDao r0 = r1._workProgressDao     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L13
            androidx.work.impl.model.WorkProgressDao_Impl r0 = new androidx.work.impl.model.WorkProgressDao_Impl     // Catch: java.lang.Throwable -> L17
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L17
            r1._workProgressDao = r0     // Catch: java.lang.Throwable -> L17
        L13:
            androidx.work.impl.model.WorkProgressDao r0 = r1._workProgressDao     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            return r0
        L17:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r0
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.WorkSpecDao workSpecDao() {
            r1 = this;
            androidx.work.impl.model.WorkSpecDao r0 = r1._workSpecDao
            if (r0 == 0) goto L7
            androidx.work.impl.model.WorkSpecDao r0 = r1._workSpecDao
            return r0
        L7:
            monitor-enter(r1)
            androidx.work.impl.model.WorkSpecDao r0 = r1._workSpecDao     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L13
            androidx.work.impl.model.WorkSpecDao_Impl r0 = new androidx.work.impl.model.WorkSpecDao_Impl     // Catch: java.lang.Throwable -> L17
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L17
            r1._workSpecDao = r0     // Catch: java.lang.Throwable -> L17
        L13:
            androidx.work.impl.model.WorkSpecDao r0 = r1._workSpecDao     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            return r0
        L17:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r0
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.model.WorkTagDao workTagDao() {
            r1 = this;
            androidx.work.impl.model.WorkTagDao r0 = r1._workTagDao
            if (r0 == 0) goto L7
            androidx.work.impl.model.WorkTagDao r0 = r1._workTagDao
            return r0
        L7:
            monitor-enter(r1)
            androidx.work.impl.model.WorkTagDao r0 = r1._workTagDao     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L13
            androidx.work.impl.model.WorkTagDao_Impl r0 = new androidx.work.impl.model.WorkTagDao_Impl     // Catch: java.lang.Throwable -> L17
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L17
            r1._workTagDao = r0     // Catch: java.lang.Throwable -> L17
        L13:
            androidx.work.impl.model.WorkTagDao r0 = r1._workTagDao     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            return r0
        L17:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r0
    }
}
