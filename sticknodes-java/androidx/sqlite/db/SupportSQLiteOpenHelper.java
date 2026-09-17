package androidx.sqlite.db;

/* loaded from: classes.dex */
public interface SupportSQLiteOpenHelper extends java.io.Closeable {

    public static abstract class Callback {
        public final int version;

        public Callback(int r1) {
                r0 = this;
                r0.<init>()
                r0.version = r1
                return
        }

        private void deleteDatabaseFile(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = ":memory:"
                boolean r0 = r3.equalsIgnoreCase(r0)
                if (r0 != 0) goto L38
                java.lang.String r0 = r3.trim()
                int r0 = r0.length()
                if (r0 != 0) goto L13
                goto L38
            L13:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "deleting the database file: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "SupportSQLite"
                android.util.Log.w(r1, r0)
                java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L32
                r0.<init>(r3)     // Catch: java.lang.Exception -> L32
                android.database.sqlite.SQLiteDatabase.deleteDatabase(r0)     // Catch: java.lang.Exception -> L32
                goto L38
            L32:
                r3 = move-exception
                java.lang.String r0 = "delete failed: "
                android.util.Log.w(r1, r0, r3)
            L38:
                return
        }

        public void onConfigure(androidx.sqlite.db.SupportSQLiteDatabase r1) {
                r0 = this;
                return
        }

        public void onCorruption(androidx.sqlite.db.SupportSQLiteDatabase r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Corruption reported by sqlite on database: "
                r0.append(r1)
                java.lang.String r1 = r3.getPath()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "SupportSQLite"
                android.util.Log.e(r1, r0)
                boolean r0 = r3.isOpen()
                if (r0 != 0) goto L28
                java.lang.String r3 = r3.getPath()
                r2.deleteDatabaseFile(r3)
                return
            L28:
                r0 = 0
                java.util.List r0 = r3.getAttachedDbs()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L30
                goto L30
            L2e:
                r1 = move-exception
                goto L34
            L30:
                r3.close()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L56
                goto L57
            L34:
                if (r0 == 0) goto L4e
                java.util.Iterator r3 = r0.iterator()
            L3a:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L55
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.second
                java.lang.String r0 = (java.lang.String) r0
                r2.deleteDatabaseFile(r0)
                goto L3a
            L4e:
                java.lang.String r3 = r3.getPath()
                r2.deleteDatabaseFile(r3)
            L55:
                throw r1
            L56:
            L57:
                if (r0 == 0) goto L71
                java.util.Iterator r3 = r0.iterator()
            L5d:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L78
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.second
                java.lang.String r0 = (java.lang.String) r0
                r2.deleteDatabaseFile(r0)
                goto L5d
            L71:
                java.lang.String r3 = r3.getPath()
                r2.deleteDatabaseFile(r3)
            L78:
                return
        }

        public abstract void onCreate(androidx.sqlite.db.SupportSQLiteDatabase r1);

        public abstract void onDowngrade(androidx.sqlite.db.SupportSQLiteDatabase r1, int r2, int r3);

        public void onOpen(androidx.sqlite.db.SupportSQLiteDatabase r1) {
                r0 = this;
                return
        }

        public abstract void onUpgrade(androidx.sqlite.db.SupportSQLiteDatabase r1, int r2, int r3);
    }

    public static class Configuration {
        public final androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback;
        public final android.content.Context context;
        public final java.lang.String name;
        public final boolean useNoBackupDirectory;

        public static class Builder {
            androidx.sqlite.db.SupportSQLiteOpenHelper.Callback mCallback;
            android.content.Context mContext;
            java.lang.String mName;
            boolean mUseNoBackUpDirectory;

            Builder(android.content.Context r1) {
                    r0 = this;
                    r0.<init>()
                    r0.mContext = r1
                    return
            }

            public androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration build() {
                    r5 = this;
                    androidx.sqlite.db.SupportSQLiteOpenHelper$Callback r0 = r5.mCallback
                    if (r0 == 0) goto L33
                    android.content.Context r0 = r5.mContext
                    if (r0 == 0) goto L2b
                    boolean r0 = r5.mUseNoBackUpDirectory
                    if (r0 == 0) goto L1d
                    java.lang.String r0 = r5.mName
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 != 0) goto L15
                    goto L1d
                L15:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.String r1 = "Must set a non-null database name to a configuration that uses the no backup directory."
                    r0.<init>(r1)
                    throw r0
                L1d:
                    androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration r0 = new androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration
                    android.content.Context r1 = r5.mContext
                    java.lang.String r2 = r5.mName
                    androidx.sqlite.db.SupportSQLiteOpenHelper$Callback r3 = r5.mCallback
                    boolean r4 = r5.mUseNoBackUpDirectory
                    r0.<init>(r1, r2, r3, r4)
                    return r0
                L2b:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.String r1 = "Must set a non-null context to create the configuration."
                    r0.<init>(r1)
                    throw r0
                L33:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.String r1 = "Must set a callback to create the configuration."
                    r0.<init>(r1)
                    throw r0
            }

            public androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Builder callback(androidx.sqlite.db.SupportSQLiteOpenHelper.Callback r1) {
                    r0 = this;
                    r0.mCallback = r1
                    return r0
            }

            public androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Builder name(java.lang.String r1) {
                    r0 = this;
                    r0.mName = r1
                    return r0
            }

            public androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Builder noBackupDirectory(boolean r1) {
                    r0 = this;
                    r0.mUseNoBackUpDirectory = r1
                    return r0
            }
        }

        Configuration(android.content.Context r1, java.lang.String r2, androidx.sqlite.db.SupportSQLiteOpenHelper.Callback r3, boolean r4) {
                r0 = this;
                r0.<init>()
                r0.context = r1
                r0.name = r2
                r0.callback = r3
                r0.useNoBackupDirectory = r4
                return
        }

        public static androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Builder builder(android.content.Context r1) {
                androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration$Builder r0 = new androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration$Builder
                r0.<init>(r1)
                return r0
        }
    }

    public interface Factory {
        androidx.sqlite.db.SupportSQLiteOpenHelper create(androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration r1);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    java.lang.String getDatabaseName();

    androidx.sqlite.db.SupportSQLiteDatabase getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean r1);
}
