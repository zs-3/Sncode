package androidx.sqlite.db.framework;

/* loaded from: classes.dex */
public final class FrameworkSQLiteOpenHelperFactory implements androidx.sqlite.db.SupportSQLiteOpenHelper.Factory {
    public FrameworkSQLiteOpenHelperFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    public androidx.sqlite.db.SupportSQLiteOpenHelper create(androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration r5) {
            r4 = this;
            androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper r0 = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper
            android.content.Context r1 = r5.context
            java.lang.String r2 = r5.name
            androidx.sqlite.db.SupportSQLiteOpenHelper$Callback r3 = r5.callback
            boolean r5 = r5.useNoBackupDirectory
            r0.<init>(r1, r2, r3, r5)
            return r0
    }
}
