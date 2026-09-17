package androidx.room;

/* loaded from: classes.dex */
class SQLiteCopyOpenHelper implements androidx.sqlite.db.SupportSQLiteOpenHelper {
    private final android.content.Context mContext;
    private final java.lang.String mCopyFromAssetPath;
    private final java.io.File mCopyFromFile;
    private androidx.room.DatabaseConfiguration mDatabaseConfiguration;
    private final int mDatabaseVersion;
    private final androidx.sqlite.db.SupportSQLiteOpenHelper mDelegate;
    private boolean mVerified;

    SQLiteCopyOpenHelper(android.content.Context r1, java.lang.String r2, java.io.File r3, int r4, androidx.sqlite.db.SupportSQLiteOpenHelper r5) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            r0.mCopyFromAssetPath = r2
            r0.mCopyFromFile = r3
            r0.mDatabaseVersion = r4
            r0.mDelegate = r5
            return
    }

    private void copyDatabaseFile(java.io.File r5) throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = r4.mCopyFromAssetPath
            if (r0 == 0) goto L15
            android.content.Context r0 = r4.mContext
            android.content.res.AssetManager r0 = r0.getAssets()
            java.lang.String r1 = r4.mCopyFromAssetPath
            java.io.InputStream r0 = r0.open(r1)
            java.nio.channels.ReadableByteChannel r0 = java.nio.channels.Channels.newChannel(r0)
            goto L24
        L15:
            java.io.File r0 = r4.mCopyFromFile
            if (r0 == 0) goto La2
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.io.File r1 = r4.mCopyFromFile
            r0.<init>(r1)
            java.nio.channels.FileChannel r0 = r0.getChannel()
        L24:
            android.content.Context r1 = r4.mContext
            java.io.File r1 = r1.getCacheDir()
            java.lang.String r2 = "room-copy-helper"
            java.lang.String r3 = ".tmp"
            java.io.File r1 = java.io.File.createTempFile(r2, r3, r1)
            r1.deleteOnExit()
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r1)
            java.nio.channels.FileChannel r2 = r2.getChannel()
            androidx.room.util.FileUtil.copy(r0, r2)
            java.io.File r0 = r5.getParentFile()
            if (r0 == 0) goto L6f
            boolean r2 = r0.exists()
            if (r2 != 0) goto L6f
            boolean r0 = r0.mkdirs()
            if (r0 == 0) goto L54
            goto L6f
        L54:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to create directories for "
            r1.append(r2)
            java.lang.String r5 = r5.getAbsolutePath()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L6f:
            boolean r0 = r1.renameTo(r5)
            if (r0 == 0) goto L76
            return
        L76:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to move intermediate file ("
            r2.append(r3)
            java.lang.String r1 = r1.getAbsolutePath()
            r2.append(r1)
            java.lang.String r1 = ") to destination ("
            r2.append(r1)
            java.lang.String r5 = r5.getAbsolutePath()
            r2.append(r5)
            java.lang.String r5 = ")."
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r0.<init>(r5)
            throw r0
        La2:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "copyFromAssetPath and copyFromFile == null!"
            r5.<init>(r0)
            throw r5
    }

    private void verifyDatabaseFile() {
            r8 = this;
            java.lang.String r0 = "ROOM"
            java.lang.String r1 = r8.getDatabaseName()
            android.content.Context r2 = r8.mContext
            java.io.File r2 = r2.getDatabasePath(r1)
            androidx.room.DatabaseConfiguration r3 = r8.mDatabaseConfiguration
            if (r3 == 0) goto L17
            boolean r3 = r3.multiInstanceInvalidation
            if (r3 == 0) goto L15
            goto L17
        L15:
            r3 = 0
            goto L18
        L17:
            r3 = 1
        L18:
            androidx.room.util.CopyLock r4 = new androidx.room.util.CopyLock
            android.content.Context r5 = r8.mContext
            java.io.File r5 = r5.getFilesDir()
            r4.<init>(r1, r5, r3)
            r4.lock()     // Catch: java.lang.Throwable -> L94
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L94
            java.lang.String r5 = "Unable to copy database file."
            if (r3 != 0) goto L3c
            r8.copyDatabaseFile(r2)     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L94
            r4.unlock()
            return
        L35:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L94
            r1.<init>(r5, r0)     // Catch: java.lang.Throwable -> L94
            throw r1     // Catch: java.lang.Throwable -> L94
        L3c:
            androidx.room.DatabaseConfiguration r3 = r8.mDatabaseConfiguration     // Catch: java.lang.Throwable -> L94
            if (r3 != 0) goto L44
            r4.unlock()
            return
        L44:
            int r3 = androidx.room.util.DBUtil.readVersion(r2)     // Catch: java.io.IOException -> L8a java.lang.Throwable -> L94
            int r6 = r8.mDatabaseVersion     // Catch: java.lang.Throwable -> L94
            if (r3 != r6) goto L50
            r4.unlock()
            return
        L50:
            androidx.room.DatabaseConfiguration r7 = r8.mDatabaseConfiguration     // Catch: java.lang.Throwable -> L94
            boolean r3 = r7.isMigrationRequired(r3, r6)     // Catch: java.lang.Throwable -> L94
            if (r3 == 0) goto L5c
            r4.unlock()
            return
        L5c:
            android.content.Context r3 = r8.mContext     // Catch: java.lang.Throwable -> L94
            boolean r3 = r3.deleteDatabase(r1)     // Catch: java.lang.Throwable -> L94
            if (r3 == 0) goto L6d
            r8.copyDatabaseFile(r2)     // Catch: java.io.IOException -> L68 java.lang.Throwable -> L94
            goto L86
        L68:
            r1 = move-exception
            android.util.Log.w(r0, r5, r1)     // Catch: java.lang.Throwable -> L94
            goto L86
        L6d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L94
            r2.<init>()     // Catch: java.lang.Throwable -> L94
            java.lang.String r3 = "Failed to delete database file ("
            r2.append(r3)     // Catch: java.lang.Throwable -> L94
            r2.append(r1)     // Catch: java.lang.Throwable -> L94
            java.lang.String r1 = ") for a copy destructive migration."
            r2.append(r1)     // Catch: java.lang.Throwable -> L94
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L94
            android.util.Log.w(r0, r1)     // Catch: java.lang.Throwable -> L94
        L86:
            r4.unlock()
            return
        L8a:
            r1 = move-exception
            java.lang.String r2 = "Unable to read database version."
            android.util.Log.w(r0, r2, r1)     // Catch: java.lang.Throwable -> L94
            r4.unlock()
            return
        L94:
            r0 = move-exception
            r4.unlock()
            throw r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
            r1 = this;
            monitor-enter(r1)
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r1.mDelegate     // Catch: java.lang.Throwable -> Lb
            r0.close()     // Catch: java.lang.Throwable -> Lb
            r0 = 0
            r1.mVerified = r0     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public java.lang.String getDatabaseName() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r1.mDelegate
            java.lang.String r0 = r0.getDatabaseName()
            return r0
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public synchronized androidx.sqlite.db.SupportSQLiteDatabase getWritableDatabase() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.mVerified     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto Lb
            r1.verifyDatabaseFile()     // Catch: java.lang.Throwable -> L13
            r0 = 1
            r1.mVerified = r0     // Catch: java.lang.Throwable -> L13
        Lb:
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r1.mDelegate     // Catch: java.lang.Throwable -> L13
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.getWritableDatabase()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    void setDatabaseConfiguration(androidx.room.DatabaseConfiguration r1) {
            r0 = this;
            r0.mDatabaseConfiguration = r1
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean r2) {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r1.mDelegate
            r0.setWriteAheadLoggingEnabled(r2)
            return
    }
}
