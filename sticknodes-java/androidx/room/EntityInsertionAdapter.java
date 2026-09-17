package androidx.room;

/* loaded from: classes.dex */
public abstract class EntityInsertionAdapter<T> extends androidx.room.SharedSQLiteStatement {
    public EntityInsertionAdapter(androidx.room.RoomDatabase r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    protected abstract void bind(androidx.sqlite.db.SupportSQLiteStatement r1, T r2);

    public final void insert(T r2) {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteStatement r0 = r1.acquire()
            r1.bind(r0, r2)     // Catch: java.lang.Throwable -> Le
            r0.executeInsert()     // Catch: java.lang.Throwable -> Le
            r1.release(r0)
            return
        Le:
            r2 = move-exception
            r1.release(r0)
            throw r2
    }
}
