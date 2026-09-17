package androidx.room;

/* loaded from: classes.dex */
public abstract class RoomDatabase {
    private boolean mAllowMainThreadQueries;
    private final java.util.Map<java.lang.String, java.lang.Object> mBackingFieldMap;

    @java.lang.Deprecated
    protected java.util.List<androidx.room.RoomDatabase.Callback> mCallbacks;
    private final java.util.concurrent.locks.ReentrantReadWriteLock mCloseLock;

    @java.lang.Deprecated
    protected volatile androidx.sqlite.db.SupportSQLiteDatabase mDatabase;
    private final androidx.room.InvalidationTracker mInvalidationTracker;
    private androidx.sqlite.db.SupportSQLiteOpenHelper mOpenHelper;
    private java.util.concurrent.Executor mQueryExecutor;
    private final java.lang.ThreadLocal<java.lang.Integer> mSuspendingTransactionId;
    private java.util.concurrent.Executor mTransactionExecutor;
    boolean mWriteAheadLoggingEnabled;

    public static class Builder<T extends androidx.room.RoomDatabase> {
        private boolean mAllowDestructiveMigrationOnDowngrade;
        private boolean mAllowMainThreadQueries;
        private java.util.ArrayList<androidx.room.RoomDatabase.Callback> mCallbacks;
        private final android.content.Context mContext;
        private java.lang.String mCopyFromAssetPath;
        private java.io.File mCopyFromFile;
        private final java.lang.Class<T> mDatabaseClass;
        private androidx.sqlite.db.SupportSQLiteOpenHelper.Factory mFactory;
        private androidx.room.RoomDatabase.JournalMode mJournalMode;
        private final androidx.room.RoomDatabase.MigrationContainer mMigrationContainer;
        private java.util.Set<java.lang.Integer> mMigrationStartAndEndVersions;
        private java.util.Set<java.lang.Integer> mMigrationsNotRequiredFrom;
        private boolean mMultiInstanceInvalidation;
        private final java.lang.String mName;
        private java.util.concurrent.Executor mQueryExecutor;
        private boolean mRequireMigration;
        private java.util.concurrent.Executor mTransactionExecutor;

        Builder(android.content.Context r1, java.lang.Class<T> r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.mContext = r1
                r0.mDatabaseClass = r2
                r0.mName = r3
                androidx.room.RoomDatabase$JournalMode r1 = androidx.room.RoomDatabase.JournalMode.AUTOMATIC
                r0.mJournalMode = r1
                r1 = 1
                r0.mRequireMigration = r1
                androidx.room.RoomDatabase$MigrationContainer r1 = new androidx.room.RoomDatabase$MigrationContainer
                r1.<init>()
                r0.mMigrationContainer = r1
                return
        }

        public androidx.room.RoomDatabase.Builder<T> addCallback(androidx.room.RoomDatabase.Callback r2) {
                r1 = this;
                java.util.ArrayList<androidx.room.RoomDatabase$Callback> r0 = r1.mCallbacks
                if (r0 != 0) goto Lb
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mCallbacks = r0
            Lb:
                java.util.ArrayList<androidx.room.RoomDatabase$Callback> r0 = r1.mCallbacks
                r0.add(r2)
                return r1
        }

        public androidx.room.RoomDatabase.Builder<T> addMigrations(androidx.room.migration.Migration... r6) {
                r5 = this;
                java.util.Set<java.lang.Integer> r0 = r5.mMigrationStartAndEndVersions
                if (r0 != 0) goto Lb
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r5.mMigrationStartAndEndVersions = r0
            Lb:
                int r0 = r6.length
                r1 = 0
            Ld:
                if (r1 >= r0) goto L2a
                r2 = r6[r1]
                java.util.Set<java.lang.Integer> r3 = r5.mMigrationStartAndEndVersions
                int r4 = r2.startVersion
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r3.add(r4)
                java.util.Set<java.lang.Integer> r3 = r5.mMigrationStartAndEndVersions
                int r2 = r2.endVersion
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3.add(r2)
                int r1 = r1 + 1
                goto Ld
            L2a:
                androidx.room.RoomDatabase$MigrationContainer r0 = r5.mMigrationContainer
                r0.addMigrations(r6)
                return r5
        }

        public androidx.room.RoomDatabase.Builder<T> allowMainThreadQueries() {
                r1 = this;
                r0 = 1
                r1.mAllowMainThreadQueries = r0
                return r1
        }

        @android.annotation.SuppressLint({"RestrictedApi"})
        public T build() {
                r21 = this;
                r0 = r21
                android.content.Context r1 = r0.mContext
                if (r1 == 0) goto Le5
                java.lang.Class<T extends androidx.room.RoomDatabase> r1 = r0.mDatabaseClass
                if (r1 == 0) goto Ldd
                java.util.concurrent.Executor r1 = r0.mQueryExecutor
                if (r1 != 0) goto L1b
                java.util.concurrent.Executor r2 = r0.mTransactionExecutor
                if (r2 != 0) goto L1b
                java.util.concurrent.Executor r1 = androidx.arch.core.executor.ArchTaskExecutor.getIOThreadExecutor()
                r0.mTransactionExecutor = r1
                r0.mQueryExecutor = r1
                goto L2c
            L1b:
                if (r1 == 0) goto L24
                java.util.concurrent.Executor r2 = r0.mTransactionExecutor
                if (r2 != 0) goto L24
                r0.mTransactionExecutor = r1
                goto L2c
            L24:
                if (r1 != 0) goto L2c
                java.util.concurrent.Executor r1 = r0.mTransactionExecutor
                if (r1 == 0) goto L2c
                r0.mQueryExecutor = r1
            L2c:
                java.util.Set<java.lang.Integer> r1 = r0.mMigrationStartAndEndVersions
                if (r1 == 0) goto L64
                java.util.Set<java.lang.Integer> r2 = r0.mMigrationsNotRequiredFrom
                if (r2 == 0) goto L64
                java.util.Iterator r1 = r1.iterator()
            L38:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L64
                java.lang.Object r2 = r1.next()
                java.lang.Integer r2 = (java.lang.Integer) r2
                java.util.Set<java.lang.Integer> r3 = r0.mMigrationsNotRequiredFrom
                boolean r3 = r3.contains(r2)
                if (r3 != 0) goto L4d
                goto L38
            L4d:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: "
                r3.append(r4)
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
            L64:
                androidx.sqlite.db.SupportSQLiteOpenHelper$Factory r1 = r0.mFactory
                if (r1 != 0) goto L6f
                androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory r1 = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory
                r1.<init>()
                r0.mFactory = r1
            L6f:
                java.lang.String r1 = r0.mCopyFromAssetPath
                if (r1 != 0) goto L77
                java.io.File r2 = r0.mCopyFromFile
                if (r2 == 0) goto L95
            L77:
                java.lang.String r2 = r0.mName
                if (r2 == 0) goto Ld5
                if (r1 == 0) goto L8a
                java.io.File r2 = r0.mCopyFromFile
                if (r2 != 0) goto L82
                goto L8a
            L82:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Both createFromAsset() and createFromFile() was called on this Builder but the database can only be created using one of the two configurations."
                r1.<init>(r2)
                throw r1
            L8a:
                androidx.room.SQLiteCopyOpenHelperFactory r2 = new androidx.room.SQLiteCopyOpenHelperFactory
                java.io.File r3 = r0.mCopyFromFile
                androidx.sqlite.db.SupportSQLiteOpenHelper$Factory r4 = r0.mFactory
                r2.<init>(r1, r3, r4)
                r0.mFactory = r2
            L95:
                androidx.room.DatabaseConfiguration r1 = new androidx.room.DatabaseConfiguration
                android.content.Context r6 = r0.mContext
                java.lang.String r7 = r0.mName
                androidx.sqlite.db.SupportSQLiteOpenHelper$Factory r8 = r0.mFactory
                androidx.room.RoomDatabase$MigrationContainer r9 = r0.mMigrationContainer
                java.util.ArrayList<androidx.room.RoomDatabase$Callback> r10 = r0.mCallbacks
                boolean r11 = r0.mAllowMainThreadQueries
                androidx.room.RoomDatabase$JournalMode r2 = r0.mJournalMode
                androidx.room.RoomDatabase$JournalMode r12 = r2.resolve(r6)
                java.util.concurrent.Executor r13 = r0.mQueryExecutor
                java.util.concurrent.Executor r14 = r0.mTransactionExecutor
                boolean r15 = r0.mMultiInstanceInvalidation
                boolean r2 = r0.mRequireMigration
                boolean r3 = r0.mAllowDestructiveMigrationOnDowngrade
                java.util.Set<java.lang.Integer> r4 = r0.mMigrationsNotRequiredFrom
                java.lang.String r5 = r0.mCopyFromAssetPath
                r18 = r4
                java.io.File r4 = r0.mCopyFromFile
                r19 = r5
                r5 = r1
                r16 = r2
                r17 = r3
                r20 = r4
                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                java.lang.Class<T extends androidx.room.RoomDatabase> r2 = r0.mDatabaseClass
                java.lang.String r3 = "_Impl"
                java.lang.Object r2 = androidx.room.Room.getGeneratedImplementation(r2, r3)
                androidx.room.RoomDatabase r2 = (androidx.room.RoomDatabase) r2
                r2.init(r1)
                return r2
            Ld5:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Cannot create from asset or file for an in-memory database."
                r1.<init>(r2)
                throw r1
            Ldd:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Must provide an abstract class that extends RoomDatabase"
                r1.<init>(r2)
                throw r1
            Le5:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Cannot provide null context for the database."
                r1.<init>(r2)
                throw r1
        }

        public androidx.room.RoomDatabase.Builder<T> fallbackToDestructiveMigration() {
                r1 = this;
                r0 = 0
                r1.mRequireMigration = r0
                r0 = 1
                r1.mAllowDestructiveMigrationOnDowngrade = r0
                return r1
        }

        public androidx.room.RoomDatabase.Builder<T> openHelperFactory(androidx.sqlite.db.SupportSQLiteOpenHelper.Factory r1) {
                r0 = this;
                r0.mFactory = r1
                return r0
        }

        public androidx.room.RoomDatabase.Builder<T> setQueryExecutor(java.util.concurrent.Executor r1) {
                r0 = this;
                r0.mQueryExecutor = r1
                return r0
        }
    }

    public static abstract class Callback {
        public Callback() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onCreate(androidx.sqlite.db.SupportSQLiteDatabase r1) {
                r0 = this;
                return
        }

        public void onDestructiveMigration(androidx.sqlite.db.SupportSQLiteDatabase r1) {
                r0 = this;
                return
        }

        public void onOpen(androidx.sqlite.db.SupportSQLiteDatabase r1) {
                r0 = this;
                return
        }
    }

    public enum JournalMode extends java.lang.Enum<androidx.room.RoomDatabase.JournalMode> {
        private static final /* synthetic */ androidx.room.RoomDatabase.JournalMode[] $VALUES = null;
        public static final androidx.room.RoomDatabase.JournalMode AUTOMATIC = null;
        public static final androidx.room.RoomDatabase.JournalMode TRUNCATE = null;
        public static final androidx.room.RoomDatabase.JournalMode WRITE_AHEAD_LOGGING = null;

        static {
                androidx.room.RoomDatabase$JournalMode r0 = new androidx.room.RoomDatabase$JournalMode
                java.lang.String r1 = "AUTOMATIC"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.room.RoomDatabase.JournalMode.AUTOMATIC = r0
                androidx.room.RoomDatabase$JournalMode r1 = new androidx.room.RoomDatabase$JournalMode
                java.lang.String r3 = "TRUNCATE"
                r4 = 1
                r1.<init>(r3, r4)
                androidx.room.RoomDatabase.JournalMode.TRUNCATE = r1
                androidx.room.RoomDatabase$JournalMode r3 = new androidx.room.RoomDatabase$JournalMode
                java.lang.String r5 = "WRITE_AHEAD_LOGGING"
                r6 = 2
                r3.<init>(r5, r6)
                androidx.room.RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING = r3
                r5 = 3
                androidx.room.RoomDatabase$JournalMode[] r5 = new androidx.room.RoomDatabase.JournalMode[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                androidx.room.RoomDatabase.JournalMode.$VALUES = r5
                return
        }

        JournalMode(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private static boolean isLowRamDevice(android.app.ActivityManager r0) {
                boolean r0 = r0.isLowRamDevice()
                return r0
        }

        public static androidx.room.RoomDatabase.JournalMode valueOf(java.lang.String r1) {
                java.lang.Class<androidx.room.RoomDatabase$JournalMode> r0 = androidx.room.RoomDatabase.JournalMode.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.room.RoomDatabase$JournalMode r1 = (androidx.room.RoomDatabase.JournalMode) r1
                return r1
        }

        public static androidx.room.RoomDatabase.JournalMode[] values() {
                androidx.room.RoomDatabase$JournalMode[] r0 = androidx.room.RoomDatabase.JournalMode.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.room.RoomDatabase$JournalMode[] r0 = (androidx.room.RoomDatabase.JournalMode[]) r0
                return r0
        }

        @android.annotation.SuppressLint({"NewApi"})
        androidx.room.RoomDatabase.JournalMode resolve(android.content.Context r2) {
                r1 = this;
                androidx.room.RoomDatabase$JournalMode r0 = androidx.room.RoomDatabase.JournalMode.AUTOMATIC
                if (r1 == r0) goto L5
                return r1
            L5:
                java.lang.String r0 = "activity"
                java.lang.Object r2 = r2.getSystemService(r0)
                android.app.ActivityManager r2 = (android.app.ActivityManager) r2
                if (r2 == 0) goto L18
                boolean r2 = isLowRamDevice(r2)
                if (r2 != 0) goto L18
                androidx.room.RoomDatabase$JournalMode r2 = androidx.room.RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING
                return r2
            L18:
                androidx.room.RoomDatabase$JournalMode r2 = androidx.room.RoomDatabase.JournalMode.TRUNCATE
                return r2
        }
    }

    public static class MigrationContainer {
        private java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, androidx.room.migration.Migration>> mMigrations;

        public MigrationContainer() {
                r1 = this;
                r1.<init>()
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.mMigrations = r0
                return
        }

        private void addMigration(androidx.room.migration.Migration r6) {
                r5 = this;
                int r0 = r6.startVersion
                int r1 = r6.endVersion
                java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, androidx.room.migration.Migration>> r2 = r5.mMigrations
                java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
                java.lang.Object r2 = r2.get(r3)
                java.util.TreeMap r2 = (java.util.TreeMap) r2
                if (r2 != 0) goto L20
                java.util.TreeMap r2 = new java.util.TreeMap
                r2.<init>()
                java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, androidx.room.migration.Migration>> r3 = r5.mMigrations
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r3.put(r0, r2)
            L20:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
                java.lang.Object r0 = r2.get(r0)
                androidx.room.migration.Migration r0 = (androidx.room.migration.Migration) r0
                if (r0 == 0) goto L4a
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Overriding migration "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = " with "
                r3.append(r0)
                r3.append(r6)
                java.lang.String r0 = r3.toString()
                java.lang.String r3 = "ROOM"
                android.util.Log.w(r3, r0)
            L4a:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
                r2.put(r0, r6)
                return
        }

        private java.util.List<androidx.room.migration.Migration> findUpMigrationPath(java.util.List<androidx.room.migration.Migration> r7, boolean r8, int r9, int r10) {
                r6 = this;
            L0:
                if (r8 == 0) goto L5
                if (r9 >= r10) goto L58
                goto L7
            L5:
                if (r9 <= r10) goto L58
            L7:
                java.util.HashMap<java.lang.Integer, java.util.TreeMap<java.lang.Integer, androidx.room.migration.Migration>> r0 = r6.mMigrations
                java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
                java.lang.Object r0 = r0.get(r1)
                java.util.TreeMap r0 = (java.util.TreeMap) r0
                r1 = 0
                if (r0 != 0) goto L17
                return r1
            L17:
                if (r8 == 0) goto L1e
                java.util.NavigableSet r2 = r0.descendingKeySet()
                goto L22
            L1e:
                java.util.Set r2 = r0.keySet()
            L22:
                java.util.Iterator r2 = r2.iterator()
            L26:
                boolean r3 = r2.hasNext()
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L54
                java.lang.Object r3 = r2.next()
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                if (r8 == 0) goto L40
                if (r3 > r10) goto L45
                if (r3 <= r9) goto L45
            L3e:
                r5 = 1
                goto L45
            L40:
                if (r3 < r10) goto L45
                if (r3 >= r9) goto L45
                goto L3e
            L45:
                if (r5 == 0) goto L26
                java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
                java.lang.Object r9 = r0.get(r9)
                r7.add(r9)
                r9 = r3
                goto L55
            L54:
                r4 = 0
            L55:
                if (r4 != 0) goto L0
                return r1
            L58:
                return r7
        }

        public void addMigrations(androidx.room.migration.Migration... r4) {
                r3 = this;
                int r0 = r4.length
                r1 = 0
            L2:
                if (r1 >= r0) goto Lc
                r2 = r4[r1]
                r3.addMigration(r2)
                int r1 = r1 + 1
                goto L2
            Lc:
                return
        }

        public java.util.List<androidx.room.migration.Migration> findMigrationPath(int r3, int r4) {
                r2 = this;
                if (r3 != r4) goto L7
                java.util.List r3 = java.util.Collections.emptyList()
                return r3
            L7:
                if (r4 <= r3) goto Lb
                r0 = 1
                goto Lc
            Lb:
                r0 = 0
            Lc:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.List r3 = r2.findUpMigrationPath(r1, r0, r3, r4)
                return r3
        }
    }

    public RoomDatabase() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r1.mCloseLock = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r1.mSuspendingTransactionId = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.mBackingFieldMap = r0
            androidx.room.InvalidationTracker r0 = r1.createInvalidationTracker()
            r1.mInvalidationTracker = r0
            return
    }

    private static boolean isMainThread() {
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 != r1) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public void assertNotMainThread() {
            r2 = this;
            boolean r0 = r2.mAllowMainThreadQueries
            if (r0 == 0) goto L5
            return
        L5:
            boolean r0 = isMainThread()
            if (r0 != 0) goto Lc
            return
        Lc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot access database on the main thread since it may potentially lock the UI for a long period of time."
            r0.<init>(r1)
            throw r0
    }

    public void assertNotSuspendingTransaction() {
            r2 = this;
            boolean r0 = r2.inTransaction()
            if (r0 != 0) goto L17
            java.lang.ThreadLocal<java.lang.Integer> r0 = r2.mSuspendingTransactionId
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot access database on a different coroutine context inherited from a suspending transaction."
            r0.<init>(r1)
            throw r0
        L17:
            return
    }

    @java.lang.Deprecated
    public void beginTransaction() {
            r2 = this;
            r2.assertNotMainThread()
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r2.mOpenHelper
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.getWritableDatabase()
            androidx.room.InvalidationTracker r1 = r2.mInvalidationTracker
            r1.syncTriggers(r0)
            r0.beginTransaction()
            return
    }

    public androidx.sqlite.db.SupportSQLiteStatement compileStatement(java.lang.String r2) {
            r1 = this;
            r1.assertNotMainThread()
            r1.assertNotSuspendingTransaction()
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r1.mOpenHelper
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.getWritableDatabase()
            androidx.sqlite.db.SupportSQLiteStatement r2 = r0.compileStatement(r2)
            return r2
    }

    protected abstract androidx.room.InvalidationTracker createInvalidationTracker();

    protected abstract androidx.sqlite.db.SupportSQLiteOpenHelper createOpenHelper(androidx.room.DatabaseConfiguration r1);

    @java.lang.Deprecated
    public void endTransaction() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r1.mOpenHelper
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.getWritableDatabase()
            r0.endTransaction()
            boolean r0 = r1.inTransaction()
            if (r0 != 0) goto L14
            androidx.room.InvalidationTracker r0 = r1.mInvalidationTracker
            r0.refreshVersionsAsync()
        L14:
            return
    }

    java.util.concurrent.locks.Lock getCloseLock() {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r1.mCloseLock
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            return r0
    }

    public androidx.sqlite.db.SupportSQLiteOpenHelper getOpenHelper() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r1.mOpenHelper
            return r0
    }

    public java.util.concurrent.Executor getQueryExecutor() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.mQueryExecutor
            return r0
    }

    public boolean inTransaction() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r1.mOpenHelper
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.getWritableDatabase()
            boolean r0 = r0.inTransaction()
            return r0
    }

    public void init(androidx.room.DatabaseConfiguration r4) {
            r3 = this;
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r3.createOpenHelper(r4)
            r3.mOpenHelper = r0
            boolean r1 = r0 instanceof androidx.room.SQLiteCopyOpenHelper
            if (r1 == 0) goto Lf
            androidx.room.SQLiteCopyOpenHelper r0 = (androidx.room.SQLiteCopyOpenHelper) r0
            r0.setDatabaseConfiguration(r4)
        Lf:
            androidx.room.RoomDatabase$JournalMode r0 = r4.journalMode
            androidx.room.RoomDatabase$JournalMode r1 = androidx.room.RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING
            if (r0 != r1) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            androidx.sqlite.db.SupportSQLiteOpenHelper r1 = r3.mOpenHelper
            r1.setWriteAheadLoggingEnabled(r0)
            java.util.List<androidx.room.RoomDatabase$Callback> r1 = r4.callbacks
            r3.mCallbacks = r1
            java.util.concurrent.Executor r1 = r4.queryExecutor
            r3.mQueryExecutor = r1
            androidx.room.TransactionExecutor r1 = new androidx.room.TransactionExecutor
            java.util.concurrent.Executor r2 = r4.transactionExecutor
            r1.<init>(r2)
            r3.mTransactionExecutor = r1
            boolean r1 = r4.allowMainThreadQueries
            r3.mAllowMainThreadQueries = r1
            r3.mWriteAheadLoggingEnabled = r0
            boolean r0 = r4.multiInstanceInvalidation
            if (r0 == 0) goto L41
            androidx.room.InvalidationTracker r0 = r3.mInvalidationTracker
            android.content.Context r1 = r4.context
            java.lang.String r4 = r4.name
            r0.startMultiInstanceInvalidation(r1, r4)
        L41:
            return
    }

    protected void internalInitInvalidationTracker(androidx.sqlite.db.SupportSQLiteDatabase r2) {
            r1 = this;
            androidx.room.InvalidationTracker r0 = r1.mInvalidationTracker
            r0.internalInit(r2)
            return
    }

    public boolean isOpen() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r1.mDatabase
            if (r0 == 0) goto Lc
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public android.database.Cursor query(androidx.sqlite.db.SupportSQLiteQuery r2) {
            r1 = this;
            r0 = 0
            android.database.Cursor r2 = r1.query(r2, r0)
            return r2
    }

    public android.database.Cursor query(androidx.sqlite.db.SupportSQLiteQuery r2, android.os.CancellationSignal r3) {
            r1 = this;
            r1.assertNotMainThread()
            r1.assertNotSuspendingTransaction()
            if (r3 == 0) goto L13
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r1.mOpenHelper
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.getWritableDatabase()
            android.database.Cursor r2 = r0.query(r2, r3)
            return r2
        L13:
            androidx.sqlite.db.SupportSQLiteOpenHelper r3 = r1.mOpenHelper
            androidx.sqlite.db.SupportSQLiteDatabase r3 = r3.getWritableDatabase()
            android.database.Cursor r2 = r3.query(r2)
            return r2
    }

    @java.lang.Deprecated
    public void setTransactionSuccessful() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r1.mOpenHelper
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.getWritableDatabase()
            r0.setTransactionSuccessful()
            return
    }
}
