package androidx.room;

/* loaded from: classes.dex */
public class InvalidationTracker {
    private static final java.lang.String[] TRIGGERS = null;
    volatile androidx.sqlite.db.SupportSQLiteStatement mCleanupStatement;
    final androidx.room.RoomDatabase mDatabase;
    private volatile boolean mInitialized;
    private final androidx.room.InvalidationLiveDataContainer mInvalidationLiveDataContainer;
    private androidx.room.MultiInstanceInvalidationClient mMultiInstanceInvalidationClient;
    private androidx.room.InvalidationTracker.ObservedTableTracker mObservedTableTracker;

    @android.annotation.SuppressLint({"RestrictedApi"})
    final androidx.arch.core.internal.SafeIterableMap<androidx.room.InvalidationTracker.Observer, androidx.room.InvalidationTracker.ObserverWrapper> mObserverMap;
    java.util.concurrent.atomic.AtomicBoolean mPendingRefresh;
    java.lang.Runnable mRefreshRunnable;
    final java.util.HashMap<java.lang.String, java.lang.Integer> mTableIdLookup;
    final java.lang.String[] mTableNames;
    private java.util.Map<java.lang.String, java.util.Set<java.lang.String>> mViewTables;


    static class ObservedTableTracker {
        boolean mNeedsSync;
        boolean mPendingSync;
        final long[] mTableObservers;
        final int[] mTriggerStateChanges;
        final boolean[] mTriggerStates;

        ObservedTableTracker(int r5) {
                r4 = this;
                r4.<init>()
                long[] r0 = new long[r5]
                r4.mTableObservers = r0
                boolean[] r1 = new boolean[r5]
                r4.mTriggerStates = r1
                int[] r5 = new int[r5]
                r4.mTriggerStateChanges = r5
                r2 = 0
                java.util.Arrays.fill(r0, r2)
                r5 = 0
                java.util.Arrays.fill(r1, r5)
                return
        }

        int[] getTablesToSync() {
                r9 = this;
                monitor-enter(r9)
                boolean r0 = r9.mNeedsSync     // Catch: java.lang.Throwable -> L42
                if (r0 == 0) goto L3f
                boolean r0 = r9.mPendingSync     // Catch: java.lang.Throwable -> L42
                if (r0 == 0) goto La
                goto L3f
            La:
                long[] r0 = r9.mTableObservers     // Catch: java.lang.Throwable -> L42
                int r0 = r0.length     // Catch: java.lang.Throwable -> L42
                r1 = 0
                r2 = 0
            Lf:
                r3 = 1
                if (r2 >= r0) goto L37
                long[] r4 = r9.mTableObservers     // Catch: java.lang.Throwable -> L42
                r5 = r4[r2]     // Catch: java.lang.Throwable -> L42
                r7 = 0
                int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r4 <= 0) goto L1e
                r4 = 1
                goto L1f
            L1e:
                r4 = 0
            L1f:
                boolean[] r5 = r9.mTriggerStates     // Catch: java.lang.Throwable -> L42
                boolean r6 = r5[r2]     // Catch: java.lang.Throwable -> L42
                if (r4 == r6) goto L2e
                int[] r6 = r9.mTriggerStateChanges     // Catch: java.lang.Throwable -> L42
                if (r4 == 0) goto L2a
                goto L2b
            L2a:
                r3 = 2
            L2b:
                r6[r2] = r3     // Catch: java.lang.Throwable -> L42
                goto L32
            L2e:
                int[] r3 = r9.mTriggerStateChanges     // Catch: java.lang.Throwable -> L42
                r3[r2] = r1     // Catch: java.lang.Throwable -> L42
            L32:
                r5[r2] = r4     // Catch: java.lang.Throwable -> L42
                int r2 = r2 + 1
                goto Lf
            L37:
                r9.mPendingSync = r3     // Catch: java.lang.Throwable -> L42
                r9.mNeedsSync = r1     // Catch: java.lang.Throwable -> L42
                int[] r0 = r9.mTriggerStateChanges     // Catch: java.lang.Throwable -> L42
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L42
                return r0
            L3f:
                r0 = 0
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L42
                return r0
            L42:
                r0 = move-exception
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L42
                throw r0
        }

        boolean onAdded(int... r10) {
                r9 = this;
                monitor-enter(r9)
                int r0 = r10.length     // Catch: java.lang.Throwable -> L20
                r1 = 0
                r2 = 0
            L4:
                if (r1 >= r0) goto L1e
                r3 = r10[r1]     // Catch: java.lang.Throwable -> L20
                long[] r4 = r9.mTableObservers     // Catch: java.lang.Throwable -> L20
                r5 = r4[r3]     // Catch: java.lang.Throwable -> L20
                r7 = 1
                long r7 = r7 + r5
                r4[r3] = r7     // Catch: java.lang.Throwable -> L20
                r3 = 0
                r7 = 1
                int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r8 != 0) goto L1b
                r9.mNeedsSync = r7     // Catch: java.lang.Throwable -> L20
                r2 = 1
            L1b:
                int r1 = r1 + 1
                goto L4
            L1e:
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L20
                return r2
            L20:
                r10 = move-exception
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L20
                throw r10
        }

        boolean onRemoved(int... r12) {
                r11 = this;
                monitor-enter(r11)
                int r0 = r12.length     // Catch: java.lang.Throwable -> L1f
                r1 = 0
                r2 = 0
            L4:
                if (r1 >= r0) goto L1d
                r3 = r12[r1]     // Catch: java.lang.Throwable -> L1f
                long[] r4 = r11.mTableObservers     // Catch: java.lang.Throwable -> L1f
                r5 = r4[r3]     // Catch: java.lang.Throwable -> L1f
                r7 = 1
                long r9 = r5 - r7
                r4[r3] = r9     // Catch: java.lang.Throwable -> L1f
                r3 = 1
                int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r4 != 0) goto L1a
                r11.mNeedsSync = r3     // Catch: java.lang.Throwable -> L1f
                r2 = 1
            L1a:
                int r1 = r1 + 1
                goto L4
            L1d:
                monitor-exit(r11)     // Catch: java.lang.Throwable -> L1f
                return r2
            L1f:
                r12 = move-exception
                monitor-exit(r11)     // Catch: java.lang.Throwable -> L1f
                throw r12
        }

        void onSyncCompleted() {
                r1 = this;
                monitor-enter(r1)
                r0 = 0
                r1.mPendingSync = r0     // Catch: java.lang.Throwable -> L6
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
                return
            L6:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
                throw r0
        }
    }

    public static abstract class Observer {
        final java.lang.String[] mTables;

        public Observer(java.lang.String[] r2) {
                r1 = this;
                r1.<init>()
                int r0 = r2.length
                java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
                java.lang.String[] r2 = (java.lang.String[]) r2
                r1.mTables = r2
                return
        }

        boolean isRemote() {
                r1 = this;
                r0 = 0
                return r0
        }

        public abstract void onInvalidated(java.util.Set<java.lang.String> r1);
    }

    static class ObserverWrapper {
        final androidx.room.InvalidationTracker.Observer mObserver;
        private final java.util.Set<java.lang.String> mSingleTableSet;
        final int[] mTableIds;
        private final java.lang.String[] mTableNames;

        ObserverWrapper(androidx.room.InvalidationTracker.Observer r1, int[] r2, java.lang.String[] r3) {
                r0 = this;
                r0.<init>()
                r0.mObserver = r1
                r0.mTableIds = r2
                r0.mTableNames = r3
                int r1 = r2.length
                r2 = 1
                if (r1 != r2) goto L1f
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>()
                r2 = 0
                r2 = r3[r2]
                r1.add(r2)
                java.util.Set r1 = java.util.Collections.unmodifiableSet(r1)
                r0.mSingleTableSet = r1
                goto L22
            L1f:
                r1 = 0
                r0.mSingleTableSet = r1
            L22:
                return
        }

        void notifyByTableInvalidStatus(java.util.Set<java.lang.Integer> r5) {
                r4 = this;
                int[] r0 = r4.mTableIds
                int r0 = r0.length
                r1 = 0
                r2 = 0
            L5:
                if (r2 >= r0) goto L2c
                int[] r3 = r4.mTableIds
                r3 = r3[r2]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                boolean r3 = r5.contains(r3)
                if (r3 == 0) goto L29
                r3 = 1
                if (r0 != r3) goto L1b
                java.util.Set<java.lang.String> r1 = r4.mSingleTableSet
                goto L29
            L1b:
                if (r1 != 0) goto L22
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>(r0)
            L22:
                java.lang.String[] r3 = r4.mTableNames
                r3 = r3[r2]
                r1.add(r3)
            L29:
                int r2 = r2 + 1
                goto L5
            L2c:
                if (r1 == 0) goto L33
                androidx.room.InvalidationTracker$Observer r5 = r4.mObserver
                r5.onInvalidated(r1)
            L33:
                return
        }

        void notifyByTableNames(java.lang.String[] r12) {
                r11 = this;
                java.lang.String[] r0 = r11.mTableNames
                int r0 = r0.length
                r1 = 0
                r2 = 1
                r3 = 0
                if (r0 != r2) goto L1e
                int r0 = r12.length
                r2 = 0
            La:
                if (r2 >= r0) goto L48
                r4 = r12[r2]
                java.lang.String[] r5 = r11.mTableNames
                r5 = r5[r1]
                boolean r4 = r4.equalsIgnoreCase(r5)
                if (r4 == 0) goto L1b
                java.util.Set<java.lang.String> r3 = r11.mSingleTableSet
                goto L48
            L1b:
                int r2 = r2 + 1
                goto La
            L1e:
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                int r2 = r12.length
                r4 = 0
            L25:
                if (r4 >= r2) goto L41
                r5 = r12[r4]
                java.lang.String[] r6 = r11.mTableNames
                int r7 = r6.length
                r8 = 0
            L2d:
                if (r8 >= r7) goto L3e
                r9 = r6[r8]
                boolean r10 = r9.equalsIgnoreCase(r5)
                if (r10 == 0) goto L3b
                r0.add(r9)
                goto L3e
            L3b:
                int r8 = r8 + 1
                goto L2d
            L3e:
                int r4 = r4 + 1
                goto L25
            L41:
                int r12 = r0.size()
                if (r12 <= 0) goto L48
                r3 = r0
            L48:
                if (r3 == 0) goto L4f
                androidx.room.InvalidationTracker$Observer r12 = r11.mObserver
                r12.onInvalidated(r3)
            L4f:
                return
        }
    }

    static {
            java.lang.String r0 = "UPDATE"
            java.lang.String r1 = "DELETE"
            java.lang.String r2 = "INSERT"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            androidx.room.InvalidationTracker.TRIGGERS = r0
            return
    }

    public InvalidationTracker(androidx.room.RoomDatabase r5, java.util.Map<java.lang.String, java.lang.String> r6, java.util.Map<java.lang.String, java.util.Set<java.lang.String>> r7, java.lang.String... r8) {
            r4 = this;
            r4.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r4.mPendingRefresh = r0
            r4.mInitialized = r1
            androidx.arch.core.internal.SafeIterableMap r0 = new androidx.arch.core.internal.SafeIterableMap
            r0.<init>()
            r4.mObserverMap = r0
            androidx.room.InvalidationTracker$1 r0 = new androidx.room.InvalidationTracker$1
            r0.<init>(r4)
            r4.mRefreshRunnable = r0
            r4.mDatabase = r5
            androidx.room.InvalidationTracker$ObservedTableTracker r0 = new androidx.room.InvalidationTracker$ObservedTableTracker
            int r2 = r8.length
            r0.<init>(r2)
            r4.mObservedTableTracker = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.mTableIdLookup = r0
            r4.mViewTables = r7
            androidx.room.InvalidationLiveDataContainer r7 = new androidx.room.InvalidationLiveDataContainer
            r7.<init>(r5)
            r4.mInvalidationLiveDataContainer = r7
            int r5 = r8.length
            java.lang.String[] r7 = new java.lang.String[r5]
            r4.mTableNames = r7
        L3a:
            if (r1 >= r5) goto L67
            r7 = r8[r1]
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r7 = r7.toLowerCase(r0)
            java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r4.mTableIdLookup
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r2.put(r7, r3)
            r2 = r8[r1]
            java.lang.Object r2 = r6.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L60
            java.lang.String[] r7 = r4.mTableNames
            java.lang.String r0 = r2.toLowerCase(r0)
            r7[r1] = r0
            goto L64
        L60:
            java.lang.String[] r0 = r4.mTableNames
            r0[r1] = r7
        L64:
            int r1 = r1 + 1
            goto L3a
        L67:
            java.util.Set r5 = r6.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L6f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto La3
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getValue()
            java.lang.String r7 = (java.lang.String) r7
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r7 = r7.toLowerCase(r8)
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r4.mTableIdLookup
            boolean r0 = r0.containsKey(r7)
            if (r0 == 0) goto L6f
            java.lang.Object r6 = r6.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = r6.toLowerCase(r8)
            java.util.HashMap<java.lang.String, java.lang.Integer> r8 = r4.mTableIdLookup
            java.lang.Object r7 = r8.get(r7)
            r8.put(r6, r7)
            goto L6f
        La3:
            return
    }

    private static void appendTriggerName(java.lang.StringBuilder r2, java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = "`"
            r2.append(r0)
            java.lang.String r1 = "room_table_modification_trigger_"
            r2.append(r1)
            r2.append(r3)
            java.lang.String r3 = "_"
            r2.append(r3)
            r2.append(r4)
            r2.append(r0)
            return
    }

    private java.lang.String[] resolveViews(java.lang.String[] r7) {
            r6 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            int r1 = r7.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L2b
            r3 = r7[r2]
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r4 = r3.toLowerCase(r4)
            java.util.Map<java.lang.String, java.util.Set<java.lang.String>> r5 = r6.mViewTables
            boolean r5 = r5.containsKey(r4)
            if (r5 == 0) goto L25
            java.util.Map<java.lang.String, java.util.Set<java.lang.String>> r3 = r6.mViewTables
            java.lang.Object r3 = r3.get(r4)
            java.util.Collection r3 = (java.util.Collection) r3
            r0.addAll(r3)
            goto L28
        L25:
            r0.add(r3)
        L28:
            int r2 = r2 + 1
            goto L7
        L2b:
            int r7 = r0.size()
            java.lang.String[] r7 = new java.lang.String[r7]
            java.lang.Object[] r7 = r0.toArray(r7)
            java.lang.String[] r7 = (java.lang.String[]) r7
            return r7
    }

    private void startTrackingTable(androidx.sqlite.db.SupportSQLiteDatabase r9, int r10) {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "INSERT OR IGNORE INTO room_table_modification_log VALUES("
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ", 0)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.execSQL(r0)
            java.lang.String[] r0 = r8.mTableNames
            r0 = r0[r10]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String[] r2 = androidx.room.InvalidationTracker.TRIGGERS
            int r3 = r2.length
            r4 = 0
            r5 = 0
        L27:
            if (r5 >= r3) goto L8d
            r6 = r2[r5]
            r1.setLength(r4)
            java.lang.String r7 = "CREATE TEMP TRIGGER IF NOT EXISTS "
            r1.append(r7)
            appendTriggerName(r1, r0, r6)
            java.lang.String r7 = " AFTER "
            r1.append(r7)
            r1.append(r6)
            java.lang.String r6 = " ON `"
            r1.append(r6)
            r1.append(r0)
            java.lang.String r6 = "` BEGIN UPDATE "
            r1.append(r6)
            java.lang.String r6 = "room_table_modification_log"
            r1.append(r6)
            java.lang.String r6 = " SET "
            r1.append(r6)
            java.lang.String r6 = "invalidated"
            r1.append(r6)
            java.lang.String r7 = " = 1"
            r1.append(r7)
            java.lang.String r7 = " WHERE "
            r1.append(r7)
            java.lang.String r7 = "table_id"
            r1.append(r7)
            java.lang.String r7 = " = "
            r1.append(r7)
            r1.append(r10)
            java.lang.String r7 = " AND "
            r1.append(r7)
            r1.append(r6)
            java.lang.String r6 = " = 0"
            r1.append(r6)
            java.lang.String r6 = "; END"
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r9.execSQL(r6)
            int r5 = r5 + 1
            goto L27
        L8d:
            return
    }

    private void stopTrackingTable(androidx.sqlite.db.SupportSQLiteDatabase r8, int r9) {
            r7 = this;
            java.lang.String[] r0 = r7.mTableNames
            r9 = r0[r9]
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String[] r1 = androidx.room.InvalidationTracker.TRIGGERS
            int r2 = r1.length
            r3 = 0
            r4 = 0
        Le:
            if (r4 >= r2) goto L27
            r5 = r1[r4]
            r0.setLength(r3)
            java.lang.String r6 = "DROP TRIGGER IF EXISTS "
            r0.append(r6)
            appendTriggerName(r0, r9, r5)
            java.lang.String r5 = r0.toString()
            r8.execSQL(r5)
            int r4 = r4 + 1
            goto Le
        L27:
            return
    }

    @android.annotation.SuppressLint({"RestrictedApi"})
    public void addObserver(androidx.room.InvalidationTracker.Observer r8) {
            r7 = this;
            java.lang.String[] r0 = r8.mTables
            java.lang.String[] r0 = r7.resolveViews(r0)
            int r1 = r0.length
            int[] r1 = new int[r1]
            int r2 = r0.length
            r3 = 0
        Lb:
            if (r3 >= r2) goto L41
            java.util.HashMap<java.lang.String, java.lang.Integer> r4 = r7.mTableIdLookup
            r5 = r0[r3]
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r5 = r5.toLowerCase(r6)
            java.lang.Object r4 = r4.get(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L28
            int r4 = r4.intValue()
            r1[r3] = r4
            int r3 = r3 + 1
            goto Lb
        L28:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "There is no table with name "
            r1.append(r2)
            r0 = r0[r3]
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r8.<init>(r0)
            throw r8
        L41:
            androidx.room.InvalidationTracker$ObserverWrapper r2 = new androidx.room.InvalidationTracker$ObserverWrapper
            r2.<init>(r8, r1, r0)
            androidx.arch.core.internal.SafeIterableMap<androidx.room.InvalidationTracker$Observer, androidx.room.InvalidationTracker$ObserverWrapper> r0 = r7.mObserverMap
            monitor-enter(r0)
            androidx.arch.core.internal.SafeIterableMap<androidx.room.InvalidationTracker$Observer, androidx.room.InvalidationTracker$ObserverWrapper> r3 = r7.mObserverMap     // Catch: java.lang.Throwable -> L60
            java.lang.Object r8 = r3.putIfAbsent(r8, r2)     // Catch: java.lang.Throwable -> L60
            androidx.room.InvalidationTracker$ObserverWrapper r8 = (androidx.room.InvalidationTracker.ObserverWrapper) r8     // Catch: java.lang.Throwable -> L60
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L60
            if (r8 != 0) goto L5f
            androidx.room.InvalidationTracker$ObservedTableTracker r8 = r7.mObservedTableTracker
            boolean r8 = r8.onAdded(r1)
            if (r8 == 0) goto L5f
            r7.syncTriggers()
        L5f:
            return
        L60:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L60
            throw r8
    }

    boolean ensureInitialization() {
            r3 = this;
            androidx.room.RoomDatabase r0 = r3.mDatabase
            boolean r0 = r0.isOpen()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            boolean r0 = r3.mInitialized
            if (r0 != 0) goto L17
            androidx.room.RoomDatabase r0 = r3.mDatabase
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r0.getOpenHelper()
            r0.getWritableDatabase()
        L17:
            boolean r0 = r3.mInitialized
            if (r0 != 0) goto L23
            java.lang.String r0 = "ROOM"
            java.lang.String r2 = "database is not initialized even though it is open"
            android.util.Log.e(r0, r2)
            return r1
        L23:
            r0 = 1
            return r0
    }

    void internalInit(androidx.sqlite.db.SupportSQLiteDatabase r2) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.mInitialized     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto Le
            java.lang.String r2 = "ROOM"
            java.lang.String r0 = "Invalidation tracker is initialized twice :/."
            android.util.Log.e(r2, r0)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2d
            return
        Le:
            java.lang.String r0 = "PRAGMA temp_store = MEMORY;"
            r2.execSQL(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r0 = "PRAGMA recursive_triggers='ON';"
            r2.execSQL(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r0 = "CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)"
            r2.execSQL(r0)     // Catch: java.lang.Throwable -> L2d
            r1.syncTriggers(r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r0 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 "
            androidx.sqlite.db.SupportSQLiteStatement r2 = r2.compileStatement(r0)     // Catch: java.lang.Throwable -> L2d
            r1.mCleanupStatement = r2     // Catch: java.lang.Throwable -> L2d
            r2 = 1
            r1.mInitialized = r2     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2d
            return
        L2d:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2d
            throw r2
    }

    public void notifyObserversByTableNames(java.lang.String... r5) {
            r4 = this;
            androidx.arch.core.internal.SafeIterableMap<androidx.room.InvalidationTracker$Observer, androidx.room.InvalidationTracker$ObserverWrapper> r0 = r4.mObserverMap
            monitor-enter(r0)
            androidx.arch.core.internal.SafeIterableMap<androidx.room.InvalidationTracker$Observer, androidx.room.InvalidationTracker$ObserverWrapper> r1 = r4.mObserverMap     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2d
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2d
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L2d
            androidx.room.InvalidationTracker$Observer r3 = (androidx.room.InvalidationTracker.Observer) r3     // Catch: java.lang.Throwable -> L2d
            boolean r3 = r3.isRemote()     // Catch: java.lang.Throwable -> L2d
            if (r3 != 0) goto L9
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L2d
            androidx.room.InvalidationTracker$ObserverWrapper r2 = (androidx.room.InvalidationTracker.ObserverWrapper) r2     // Catch: java.lang.Throwable -> L2d
            r2.notifyByTableNames(r5)     // Catch: java.lang.Throwable -> L2d
            goto L9
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            return
        L2d:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            throw r5
    }

    public void refreshVersionsAsync() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.mPendingRefresh
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L15
            androidx.room.RoomDatabase r0 = r3.mDatabase
            java.util.concurrent.Executor r0 = r0.getQueryExecutor()
            java.lang.Runnable r1 = r3.mRefreshRunnable
            r0.execute(r1)
        L15:
            return
    }

    @android.annotation.SuppressLint({"RestrictedApi"})
    public void removeObserver(androidx.room.InvalidationTracker.Observer r3) {
            r2 = this;
            androidx.arch.core.internal.SafeIterableMap<androidx.room.InvalidationTracker$Observer, androidx.room.InvalidationTracker$ObserverWrapper> r0 = r2.mObserverMap
            monitor-enter(r0)
            androidx.arch.core.internal.SafeIterableMap<androidx.room.InvalidationTracker$Observer, androidx.room.InvalidationTracker$ObserverWrapper> r1 = r2.mObserverMap     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r3 = r1.remove(r3)     // Catch: java.lang.Throwable -> L1c
            androidx.room.InvalidationTracker$ObserverWrapper r3 = (androidx.room.InvalidationTracker.ObserverWrapper) r3     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L1b
            androidx.room.InvalidationTracker$ObservedTableTracker r0 = r2.mObservedTableTracker
            int[] r3 = r3.mTableIds
            boolean r3 = r0.onRemoved(r3)
            if (r3 == 0) goto L1b
            r2.syncTriggers()
        L1b:
            return
        L1c:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r3
    }

    void startMultiInstanceInvalidation(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            androidx.room.MultiInstanceInvalidationClient r0 = new androidx.room.MultiInstanceInvalidationClient
            androidx.room.RoomDatabase r1 = r2.mDatabase
            java.util.concurrent.Executor r1 = r1.getQueryExecutor()
            r0.<init>(r3, r4, r2, r1)
            r2.mMultiInstanceInvalidationClient = r0
            return
    }

    void syncTriggers() {
            r1 = this;
            androidx.room.RoomDatabase r0 = r1.mDatabase
            boolean r0 = r0.isOpen()
            if (r0 != 0) goto L9
            return
        L9:
            androidx.room.RoomDatabase r0 = r1.mDatabase
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r0.getOpenHelper()
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.getWritableDatabase()
            r1.syncTriggers(r0)
            return
    }

    void syncTriggers(androidx.sqlite.db.SupportSQLiteDatabase r7) {
            r6 = this;
            boolean r0 = r7.inTransaction()
            if (r0 == 0) goto L7
            return
        L7:
            androidx.room.RoomDatabase r0 = r6.mDatabase     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.IllegalStateException -> L51
            java.util.concurrent.locks.Lock r0 = r0.getCloseLock()     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.IllegalStateException -> L51
            r0.lock()     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.IllegalStateException -> L51
            androidx.room.InvalidationTracker$ObservedTableTracker r1 = r6.mObservedTableTracker     // Catch: java.lang.Throwable -> L4a
            int[] r1 = r1.getTablesToSync()     // Catch: java.lang.Throwable -> L4a
            if (r1 != 0) goto L1c
            r0.unlock()     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.IllegalStateException -> L51
            return
        L1c:
            int r2 = r1.length     // Catch: java.lang.Throwable -> L4a
            r7.beginTransaction()     // Catch: java.lang.Throwable -> L4a
            r3 = 0
        L21:
            if (r3 >= r2) goto L36
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L45
            r5 = 1
            if (r4 == r5) goto L30
            r5 = 2
            if (r4 == r5) goto L2c
            goto L33
        L2c:
            r6.stopTrackingTable(r7, r3)     // Catch: java.lang.Throwable -> L45
            goto L33
        L30:
            r6.startTrackingTable(r7, r3)     // Catch: java.lang.Throwable -> L45
        L33:
            int r3 = r3 + 1
            goto L21
        L36:
            r7.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L45
            r7.endTransaction()     // Catch: java.lang.Throwable -> L4a
            androidx.room.InvalidationTracker$ObservedTableTracker r1 = r6.mObservedTableTracker     // Catch: java.lang.Throwable -> L4a
            r1.onSyncCompleted()     // Catch: java.lang.Throwable -> L4a
            r0.unlock()     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.IllegalStateException -> L51
            goto L7
        L45:
            r1 = move-exception
            r7.endTransaction()     // Catch: java.lang.Throwable -> L4a
            throw r1     // Catch: java.lang.Throwable -> L4a
        L4a:
            r7 = move-exception
            r0.unlock()     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.IllegalStateException -> L51
            throw r7     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.IllegalStateException -> L51
        L4f:
            r7 = move-exception
            goto L52
        L51:
            r7 = move-exception
        L52:
            java.lang.String r0 = "ROOM"
            java.lang.String r1 = "Cannot run invalidation tracker. Is the db closed?"
            android.util.Log.e(r0, r1, r7)
            return
    }
}
