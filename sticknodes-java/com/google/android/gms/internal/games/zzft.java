package com.google.android.gms.internal.games;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzft {
    private static final com.google.android.gms.common.internal.GmsLogger zza = null;

    static {
            com.google.android.gms.common.internal.GmsLogger r0 = new com.google.android.gms.common.internal.GmsLogger
            java.lang.String r1 = "Games"
            r0.<init>(r1)
            com.google.android.gms.internal.games.zzft.zza = r0
            return
    }

    public static void zza(java.lang.String r1, java.lang.String r2) {
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.android.gms.internal.games.zzft.zza
            java.lang.String r1 = zzf(r1)
            r0.e(r1, r2)
            return
    }

    public static void zzb(java.lang.String r1, java.lang.String r2, java.lang.Throwable r3) {
            com.google.android.gms.common.internal.GmsLogger r1 = com.google.android.gms.internal.games.zzft.zza
            java.lang.String r2 = "GamesGmsClientImpl"
            java.lang.String r2 = zzf(r2)
            java.lang.String r0 = "Is player signed out?"
            r1.e(r2, r0, r3)
            return
    }

    public static void zzc(java.lang.String r1, java.lang.String r2, java.lang.Throwable r3) {
            com.google.android.gms.common.internal.GmsLogger r1 = com.google.android.gms.internal.games.zzft.zza
            java.lang.String r2 = "SnapshotContentsEntity"
            java.lang.String r2 = zzf(r2)
            java.lang.String r0 = "Failed to write snapshot data"
            r1.i(r2, r0, r3)
            return
    }

    public static void zzd(java.lang.String r1, java.lang.String r2) {
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.android.gms.internal.games.zzft.zza
            java.lang.String r1 = zzf(r1)
            r0.w(r1, r2)
            return
    }

    public static void zze(java.lang.String r1, java.lang.String r2, java.lang.Throwable r3) {
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.android.gms.internal.games.zzft.zza
            java.lang.String r1 = zzf(r1)
            r0.w(r1, r2, r3)
            return
    }

    private static java.lang.String zzf(java.lang.String r3) {
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            java.lang.String r2 = "PlayGamesServices"
            r0[r1] = r2
            r1 = 1
            r0[r1] = r3
            java.lang.String r3 = "%s[%s]"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            return r3
    }
}
