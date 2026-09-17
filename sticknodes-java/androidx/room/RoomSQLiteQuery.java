package androidx.room;

/* loaded from: classes.dex */
public class RoomSQLiteQuery implements androidx.sqlite.db.SupportSQLiteQuery, androidx.sqlite.db.SupportSQLiteProgram {
    static final java.util.TreeMap<java.lang.Integer, androidx.room.RoomSQLiteQuery> sQueryPool = null;
    int mArgCount;
    private final int[] mBindingTypes;
    final byte[][] mBlobBindings;
    final int mCapacity;
    final double[] mDoubleBindings;
    final long[] mLongBindings;
    private volatile java.lang.String mQuery;
    final java.lang.String[] mStringBindings;

    static {
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            androidx.room.RoomSQLiteQuery.sQueryPool = r0
            return
    }

    private RoomSQLiteQuery(int r2) {
            r1 = this;
            r1.<init>()
            r1.mCapacity = r2
            int r2 = r2 + 1
            int[] r0 = new int[r2]
            r1.mBindingTypes = r0
            long[] r0 = new long[r2]
            r1.mLongBindings = r0
            double[] r0 = new double[r2]
            r1.mDoubleBindings = r0
            java.lang.String[] r0 = new java.lang.String[r2]
            r1.mStringBindings = r0
            byte[][] r2 = new byte[r2][]
            r1.mBlobBindings = r2
            return
    }

    public static androidx.room.RoomSQLiteQuery acquire(java.lang.String r3, int r4) {
            java.util.TreeMap<java.lang.Integer, androidx.room.RoomSQLiteQuery> r0 = androidx.room.RoomSQLiteQuery.sQueryPool
            monitor-enter(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L29
            java.util.Map$Entry r1 = r0.ceilingEntry(r1)     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L1f
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L29
            r0.remove(r2)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L29
            androidx.room.RoomSQLiteQuery r1 = (androidx.room.RoomSQLiteQuery) r1     // Catch: java.lang.Throwable -> L29
            r1.init(r3, r4)     // Catch: java.lang.Throwable -> L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            return r1
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            androidx.room.RoomSQLiteQuery r0 = new androidx.room.RoomSQLiteQuery
            r0.<init>(r4)
            r0.init(r3, r4)
            return r0
        L29:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r3
    }

    private static void prunePoolLocked() {
            java.util.TreeMap<java.lang.Integer, androidx.room.RoomSQLiteQuery> r0 = androidx.room.RoomSQLiteQuery.sQueryPool
            int r1 = r0.size()
            r2 = 15
            if (r1 <= r2) goto L24
            int r1 = r0.size()
            int r1 = r1 + (-10)
            java.util.NavigableSet r0 = r0.descendingKeySet()
            java.util.Iterator r0 = r0.iterator()
        L18:
            int r2 = r1 + (-1)
            if (r1 <= 0) goto L24
            r0.next()
            r0.remove()
            r1 = r2
            goto L18
        L24:
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindBlob(int r3, byte[] r4) {
            r2 = this;
            int[] r0 = r2.mBindingTypes
            r1 = 5
            r0[r3] = r1
            byte[][] r0 = r2.mBlobBindings
            r0[r3] = r4
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindDouble(int r3, double r4) {
            r2 = this;
            int[] r0 = r2.mBindingTypes
            r1 = 3
            r0[r3] = r1
            double[] r0 = r2.mDoubleBindings
            r0[r3] = r4
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindLong(int r3, long r4) {
            r2 = this;
            int[] r0 = r2.mBindingTypes
            r1 = 2
            r0[r3] = r1
            long[] r0 = r2.mLongBindings
            r0[r3] = r4
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindNull(int r3) {
            r2 = this;
            int[] r0 = r2.mBindingTypes
            r1 = 1
            r0[r3] = r1
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteProgram
    public void bindString(int r3, java.lang.String r4) {
            r2 = this;
            int[] r0 = r2.mBindingTypes
            r1 = 4
            r0[r3] = r1
            java.lang.String[] r0 = r2.mStringBindings
            r0[r3] = r4
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public void bindTo(androidx.sqlite.db.SupportSQLiteProgram r6) {
            r5 = this;
            r0 = 1
            r1 = 1
        L2:
            int r2 = r5.mArgCount
            if (r1 > r2) goto L3f
            int[] r2 = r5.mBindingTypes
            r2 = r2[r1]
            if (r2 == r0) goto L39
            r3 = 2
            if (r2 == r3) goto L31
            r3 = 3
            if (r2 == r3) goto L29
            r3 = 4
            if (r2 == r3) goto L21
            r3 = 5
            if (r2 == r3) goto L19
            goto L3c
        L19:
            byte[][] r2 = r5.mBlobBindings
            r2 = r2[r1]
            r6.bindBlob(r1, r2)
            goto L3c
        L21:
            java.lang.String[] r2 = r5.mStringBindings
            r2 = r2[r1]
            r6.bindString(r1, r2)
            goto L3c
        L29:
            double[] r2 = r5.mDoubleBindings
            r3 = r2[r1]
            r6.bindDouble(r1, r3)
            goto L3c
        L31:
            long[] r2 = r5.mLongBindings
            r3 = r2[r1]
            r6.bindLong(r1, r3)
            goto L3c
        L39:
            r6.bindNull(r1)
        L3c:
            int r1 = r1 + 1
            goto L2
        L3f:
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public java.lang.String getSql() {
            r1 = this;
            java.lang.String r0 = r1.mQuery
            return r0
    }

    void init(java.lang.String r1, int r2) {
            r0 = this;
            r0.mQuery = r1
            r0.mArgCount = r2
            return
    }

    public void release() {
            r2 = this;
            java.util.TreeMap<java.lang.Integer, androidx.room.RoomSQLiteQuery> r0 = androidx.room.RoomSQLiteQuery.sQueryPool
            monitor-enter(r0)
            int r1 = r2.mCapacity     // Catch: java.lang.Throwable -> L11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L11
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L11
            prunePoolLocked()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }
}
