package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzftp extends android.database.sqlite.SQLiteOpenHelper {
    public zzftp(android.content.Context r2, java.lang.String r3, android.database.sqlite.SQLiteDatabase.CursorFactory r4, int r5, com.google.android.gms.internal.ads.zzftr r6) {
            r1 = this;
            com.google.android.gms.internal.ads.zzftl.zza()
            java.lang.String r4 = ""
            boolean r4 = r3.equals(r4)
            r6 = 0
            r0 = 1
            if (r0 != r4) goto Le
            r3 = r6
        Le:
            r1.<init>(r2, r3, r6, r5)
            return
    }
}
