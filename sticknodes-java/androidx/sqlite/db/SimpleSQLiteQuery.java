package androidx.sqlite.db;

/* loaded from: classes.dex */
public final class SimpleSQLiteQuery implements androidx.sqlite.db.SupportSQLiteQuery {
    private final java.lang.Object[] mBindArgs;
    private final java.lang.String mQuery;

    public SimpleSQLiteQuery(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SimpleSQLiteQuery(java.lang.String r1, java.lang.Object[] r2) {
            r0 = this;
            r0.<init>()
            r0.mQuery = r1
            r0.mBindArgs = r2
            return
    }

    private static void bind(androidx.sqlite.db.SupportSQLiteProgram r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto L7
            r2.bindNull(r3)
            goto L89
        L7:
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L12
            byte[] r4 = (byte[]) r4
            r2.bindBlob(r3, r4)
            goto L89
        L12:
            boolean r0 = r4 instanceof java.lang.Float
            if (r0 == 0) goto L22
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            double r0 = (double) r4
            r2.bindDouble(r3, r0)
            goto L89
        L22:
            boolean r0 = r4 instanceof java.lang.Double
            if (r0 == 0) goto L30
            java.lang.Double r4 = (java.lang.Double) r4
            double r0 = r4.doubleValue()
            r2.bindDouble(r3, r0)
            goto L89
        L30:
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 == 0) goto L3e
            java.lang.Long r4 = (java.lang.Long) r4
            long r0 = r4.longValue()
            r2.bindLong(r3, r0)
            goto L89
        L3e:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 == 0) goto L4d
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            long r0 = (long) r4
            r2.bindLong(r3, r0)
            goto L89
        L4d:
            boolean r0 = r4 instanceof java.lang.Short
            if (r0 == 0) goto L5c
            java.lang.Short r4 = (java.lang.Short) r4
            short r4 = r4.shortValue()
            long r0 = (long) r4
            r2.bindLong(r3, r0)
            goto L89
        L5c:
            boolean r0 = r4 instanceof java.lang.Byte
            if (r0 == 0) goto L6b
            java.lang.Byte r4 = (java.lang.Byte) r4
            byte r4 = r4.byteValue()
            long r0 = (long) r4
            r2.bindLong(r3, r0)
            goto L89
        L6b:
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L75
            java.lang.String r4 = (java.lang.String) r4
            r2.bindString(r3, r4)
            goto L89
        L75:
            boolean r0 = r4 instanceof java.lang.Boolean
            if (r0 == 0) goto L8a
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L84
            r0 = 1
            goto L86
        L84:
            r0 = 0
        L86:
            r2.bindLong(r3, r0)
        L89:
            return
        L8a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot bind "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " at index "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r3 = " Supported types: null, byte[], float, double, long, int, short, byte, string"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    public static void bind(androidx.sqlite.db.SupportSQLiteProgram r3, java.lang.Object[] r4) {
            if (r4 != 0) goto L3
            return
        L3:
            int r0 = r4.length
            r1 = 0
        L5:
            if (r1 >= r0) goto Lf
            r2 = r4[r1]
            int r1 = r1 + 1
            bind(r3, r1, r2)
            goto L5
        Lf:
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public void bindTo(androidx.sqlite.db.SupportSQLiteProgram r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.mBindArgs
            bind(r2, r0)
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public java.lang.String getSql() {
            r1 = this;
            java.lang.String r0 = r1.mQuery
            return r0
    }
}
