package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public abstract class zzca extends android.database.sqlite.SQLiteOpenHelper {
    public zzca(android.content.Context r2, java.lang.String r3, android.database.sqlite.SQLiteDatabase.CursorFactory r4, int r5) {
            r1 = this;
            int r4 = com.google.android.gms.internal.measurement.zzcc.zzb
            com.google.android.gms.internal.measurement.zzbx.zza()
            java.lang.String r4 = ""
            boolean r4 = r3.equals(r4)
            r5 = 0
            r0 = 1
            if (r0 != r4) goto L10
            r3 = r5
        L10:
            r1.<init>(r2, r3, r5, r0)
            return
    }
}
