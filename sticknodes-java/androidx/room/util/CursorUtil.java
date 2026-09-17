package androidx.room.util;

/* loaded from: classes.dex */
public class CursorUtil {
    public static android.database.Cursor copyAndClose(android.database.Cursor r5) {
            android.database.MatrixCursor r0 = new android.database.MatrixCursor     // Catch: java.lang.Throwable -> L6a
            java.lang.String[] r1 = r5.getColumnNames()     // Catch: java.lang.Throwable -> L6a
            int r2 = r5.getCount()     // Catch: java.lang.Throwable -> L6a
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L6a
        Ld:
            boolean r1 = r5.moveToNext()     // Catch: java.lang.Throwable -> L6a
            if (r1 == 0) goto L66
            int r1 = r5.getColumnCount()     // Catch: java.lang.Throwable -> L6a
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L6a
            r2 = 0
        L1a:
            int r3 = r5.getColumnCount()     // Catch: java.lang.Throwable -> L6a
            if (r2 >= r3) goto L62
            int r3 = r5.getType(r2)     // Catch: java.lang.Throwable -> L6a
            if (r3 == 0) goto L5c
            r4 = 1
            if (r3 == r4) goto L51
            r4 = 2
            if (r3 == r4) goto L46
            r4 = 3
            if (r3 == r4) goto L3f
            r4 = 4
            if (r3 != r4) goto L39
            byte[] r3 = r5.getBlob(r2)     // Catch: java.lang.Throwable -> L6a
            r1[r2] = r3     // Catch: java.lang.Throwable -> L6a
            goto L5f
        L39:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6a
            r0.<init>()     // Catch: java.lang.Throwable -> L6a
            throw r0     // Catch: java.lang.Throwable -> L6a
        L3f:
            java.lang.String r3 = r5.getString(r2)     // Catch: java.lang.Throwable -> L6a
            r1[r2] = r3     // Catch: java.lang.Throwable -> L6a
            goto L5f
        L46:
            double r3 = r5.getDouble(r2)     // Catch: java.lang.Throwable -> L6a
            java.lang.Double r3 = java.lang.Double.valueOf(r3)     // Catch: java.lang.Throwable -> L6a
            r1[r2] = r3     // Catch: java.lang.Throwable -> L6a
            goto L5f
        L51:
            long r3 = r5.getLong(r2)     // Catch: java.lang.Throwable -> L6a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L6a
            r1[r2] = r3     // Catch: java.lang.Throwable -> L6a
            goto L5f
        L5c:
            r3 = 0
            r1[r2] = r3     // Catch: java.lang.Throwable -> L6a
        L5f:
            int r2 = r2 + 1
            goto L1a
        L62:
            r0.addRow(r1)     // Catch: java.lang.Throwable -> L6a
            goto Ld
        L66:
            r5.close()
            return r0
        L6a:
            r0 = move-exception
            r5.close()
            throw r0
    }

    public static int getColumnIndexOrThrow(android.database.Cursor r2, java.lang.String r3) {
            int r0 = r2.getColumnIndex(r3)
            if (r0 < 0) goto L7
            return r0
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "`"
            r0.append(r1)
            r0.append(r3)
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            int r2 = r2.getColumnIndexOrThrow(r3)
            return r2
    }
}
