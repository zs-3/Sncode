package androidx.room.migration;

/* loaded from: classes.dex */
public abstract class Migration {
    public final int endVersion;
    public final int startVersion;

    public Migration(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.startVersion = r1
            r0.endVersion = r2
            return
    }

    public abstract void migrate(androidx.sqlite.db.SupportSQLiteDatabase r1);
}
