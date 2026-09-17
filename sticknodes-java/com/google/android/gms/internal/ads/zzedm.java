package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzedm extends com.google.android.gms.internal.ads.zzftp {
    public zzedm(android.content.Context r7) {
            r6 = this;
            com.google.android.gms.internal.ads.zzftr r5 = com.google.android.gms.internal.ads.zzftr.zza
            java.lang.String r2 = "OfflineUpload.db"
            r3 = 0
            r4 = 1
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            java.lang.String r0 = "CREATE TABLE offline_signal_contents (timestamp INTEGER PRIMARY_KEY, serialized_proto_data BLOB)"
            r2.execSQL(r0)
            java.lang.String r0 = "CREATE TABLE offline_signal_statistics (statistic_name TEXT PRIMARY_KEY, value INTEGER)"
            r2.execSQL(r0)
            com.google.android.gms.internal.ads.zzeef.zzd(r2)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            r0.onUpgrade(r1, r2, r3)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            java.lang.String r2 = "DROP TABLE IF EXISTS offline_signal_contents"
            r1.execSQL(r2)
            java.lang.String r2 = "DROP TABLE IF EXISTS offline_signal_statistics"
            r1.execSQL(r2)
            return
    }
}
