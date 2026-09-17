package androidx.room.util;

/* loaded from: classes.dex */
public class DBUtil {
    public static void dropFtsSyncTriggers(androidx.sqlite.db.SupportSQLiteDatabase r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "SELECT name FROM sqlite_master WHERE type = 'trigger'"
            android.database.Cursor r1 = r4.query(r1)
        Lb:
            boolean r2 = r1.moveToNext()     // Catch: java.lang.Throwable -> L4b
            if (r2 == 0) goto L1a
            r2 = 0
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L4b
            r0.add(r2)     // Catch: java.lang.Throwable -> L4b
            goto Lb
        L1a:
            r1.close()
            java.util.Iterator r0 = r0.iterator()
        L21:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "room_fts_content_sync_"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L21
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "DROP TRIGGER IF EXISTS "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r4.execSQL(r1)
            goto L21
        L4a:
            return
        L4b:
            r4 = move-exception
            r1.close()
            throw r4
    }

    public static android.database.Cursor query(androidx.room.RoomDatabase r2, androidx.sqlite.db.SupportSQLiteQuery r3, boolean r4, android.os.CancellationSignal r5) {
            android.database.Cursor r2 = r2.query(r3, r5)
            if (r4 == 0) goto L2d
            boolean r3 = r2 instanceof android.database.AbstractWindowedCursor
            if (r3 == 0) goto L2d
            r3 = r2
            android.database.AbstractWindowedCursor r3 = (android.database.AbstractWindowedCursor) r3
            int r4 = r3.getCount()
            boolean r5 = r3.hasWindow()
            if (r5 == 0) goto L20
            android.database.CursorWindow r5 = r3.getWindow()
            int r5 = r5.getNumRows()
            goto L21
        L20:
            r5 = r4
        L21:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L29
            if (r5 >= r4) goto L2d
        L29:
            android.database.Cursor r2 = androidx.room.util.CursorUtil.copyAndClose(r3)
        L2d:
            return r2
    }

    public static int readVersion(java.io.File r10) throws java.io.IOException {
            r0 = 4
            r1 = 0
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r0)     // Catch: java.lang.Throwable -> L36
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L36
            r3.<init>(r10)     // Catch: java.lang.Throwable -> L36
            java.nio.channels.FileChannel r1 = r3.getChannel()     // Catch: java.lang.Throwable -> L36
            r5 = 60
            r7 = 4
            r9 = 1
            r4 = r1
            r4.tryLock(r5, r7, r9)     // Catch: java.lang.Throwable -> L36
            r3 = 60
            r1.position(r3)     // Catch: java.lang.Throwable -> L36
            int r10 = r1.read(r2)     // Catch: java.lang.Throwable -> L36
            if (r10 != r0) goto L2e
            r2.rewind()     // Catch: java.lang.Throwable -> L36
            int r10 = r2.getInt()     // Catch: java.lang.Throwable -> L36
            r1.close()
            return r10
        L2e:
            java.io.IOException r10 = new java.io.IOException     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = "Bad database header, unable to read 4 bytes at offset 60"
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L36
            throw r10     // Catch: java.lang.Throwable -> L36
        L36:
            r10 = move-exception
            if (r1 == 0) goto L3c
            r1.close()
        L3c:
            throw r10
    }
}
