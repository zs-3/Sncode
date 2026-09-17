package androidx.work.impl;

/* loaded from: classes.dex */
public class WorkDatabasePathHelper {
    private static final java.lang.String[] DATABASE_EXTRA_FILES = null;
    private static final java.lang.String TAG = null;

    static {
            java.lang.String r0 = "WrkDbPathHelper"
            java.lang.String r0 = androidx.work.Logger.tagWithPrefix(r0)
            androidx.work.impl.WorkDatabasePathHelper.TAG = r0
            java.lang.String r0 = "-journal"
            java.lang.String r1 = "-shm"
            java.lang.String r2 = "-wal"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            androidx.work.impl.WorkDatabasePathHelper.DATABASE_EXTRA_FILES = r0
            return
    }

    public static java.io.File getDatabasePath(android.content.Context r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 >= r1) goto Lb
            java.io.File r2 = getDefaultDatabasePath(r2)
            return r2
        Lb:
            java.lang.String r0 = "androidx.work.workdb"
            java.io.File r2 = getNoBackupPath(r2, r0)
            return r2
    }

    public static java.io.File getDefaultDatabasePath(android.content.Context r1) {
            java.lang.String r0 = "androidx.work.workdb"
            java.io.File r1 = r1.getDatabasePath(r0)
            return r1
    }

    private static java.io.File getNoBackupPath(android.content.Context r1, java.lang.String r2) {
            java.io.File r0 = new java.io.File
            java.io.File r1 = r1.getNoBackupFilesDir()
            r0.<init>(r1, r2)
            return r0
    }

    public static java.lang.String getWorkDatabaseName() {
            java.lang.String r0 = "androidx.work.workdb"
            return r0
    }

    public static void migrateDatabase(android.content.Context r9) {
            java.io.File r0 = getDefaultDatabasePath(r9)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L8c
            boolean r0 = r0.exists()
            if (r0 == 0) goto L8c
            androidx.work.Logger r0 = androidx.work.Logger.get()
            java.lang.String r1 = androidx.work.impl.WorkDatabasePathHelper.TAG
            r2 = 0
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            java.lang.String r4 = "Migrating WorkDatabase to the no-backup directory"
            r0.debug(r1, r4, r3)
            java.util.Map r9 = migrationPaths(r9)
            java.util.Set r0 = r9.keySet()
            java.util.Iterator r0 = r0.iterator()
        L2a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8c
            java.lang.Object r1 = r0.next()
            java.io.File r1 = (java.io.File) r1
            java.lang.Object r3 = r9.get(r1)
            java.io.File r3 = (java.io.File) r3
            boolean r4 = r1.exists()
            if (r4 == 0) goto L2a
            if (r3 == 0) goto L2a
            boolean r4 = r3.exists()
            r5 = 1
            if (r4 == 0) goto L60
            java.lang.Object[] r4 = new java.lang.Object[r5]
            r4[r2] = r3
            java.lang.String r6 = "Over-writing contents of %s"
            java.lang.String r4 = java.lang.String.format(r6, r4)
            androidx.work.Logger r6 = androidx.work.Logger.get()
            java.lang.String r7 = androidx.work.impl.WorkDatabasePathHelper.TAG
            java.lang.Throwable[] r8 = new java.lang.Throwable[r2]
            r6.warning(r7, r4, r8)
        L60:
            boolean r4 = r1.renameTo(r3)
            r6 = 2
            if (r4 == 0) goto L74
            java.lang.Object[] r4 = new java.lang.Object[r6]
            r4[r2] = r1
            r4[r5] = r3
            java.lang.String r1 = "Migrated %s to %s"
            java.lang.String r1 = java.lang.String.format(r1, r4)
            goto L80
        L74:
            java.lang.Object[] r4 = new java.lang.Object[r6]
            r4[r2] = r1
            r4[r5] = r3
            java.lang.String r1 = "Renaming %s to %s failed"
            java.lang.String r1 = java.lang.String.format(r1, r4)
        L80:
            androidx.work.Logger r3 = androidx.work.Logger.get()
            java.lang.String r4 = androidx.work.impl.WorkDatabasePathHelper.TAG
            java.lang.Throwable[] r5 = new java.lang.Throwable[r2]
            r3.debug(r4, r1, r5)
            goto L2a
        L8c:
            return
    }

    public static java.util.Map<java.io.File, java.io.File> migrationPaths(android.content.Context r10) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L54
            java.io.File r1 = getDefaultDatabasePath(r10)
            java.io.File r10 = getDatabasePath(r10)
            r0.put(r1, r10)
            java.lang.String[] r2 = androidx.work.impl.WorkDatabasePathHelper.DATABASE_EXTRA_FILES
            int r3 = r2.length
            r4 = 0
        L1a:
            if (r4 >= r3) goto L54
            r5 = r2[r4]
            java.io.File r6 = new java.io.File
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r1.getPath()
            r7.append(r8)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            java.io.File r7 = new java.io.File
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r10.getPath()
            r8.append(r9)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r7.<init>(r5)
            r0.put(r6, r7)
            int r4 = r4 + 1
            goto L1a
        L54:
            return r0
    }
}
