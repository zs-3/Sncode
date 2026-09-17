package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbcf {
    public static int zza(android.content.Context r1) {
            java.lang.String r0 = "crash_without_write"
            int r1 = zzf(r1, r0)
            return r1
    }

    public static int zzb(android.content.Context r1) {
            java.lang.String r0 = "init_without_write"
            int r1 = zzf(r1, r0)
            return r1
    }

    public static void zzc(android.content.Context r1) {
            java.lang.String r0 = "crash_without_write"
            zzg(r1, r0)
            return
    }

    public static void zzd(android.content.Context r1) {
            java.lang.String r0 = "init_without_write"
            zzg(r1, r0)
            return
    }

    public static void zze(android.content.Context r2) {
            java.lang.String r0 = "admob"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            if (r2 != 0) goto La
            return
        La:
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r0 = "init_without_write"
            android.content.SharedPreferences$Editor r2 = r2.putInt(r0, r1)
            java.lang.String r0 = "crash_without_write"
            android.content.SharedPreferences$Editor r2 = r2.putInt(r0, r1)
            r2.commit()
            return
    }

    private static int zzf(android.content.Context r2, java.lang.String r3) {
            java.lang.String r0 = "admob"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            if (r2 != 0) goto La
            return r1
        La:
            int r2 = r2.getInt(r3, r1)     // Catch: java.lang.ClassCastException -> Lf
            return r2
        Lf:
            return r1
    }

    private static void zzg(android.content.Context r2, java.lang.String r3) {
            java.lang.String r0 = "admob"
            r1 = 0
            android.content.SharedPreferences r0 = r2.getSharedPreferences(r0, r1)
            if (r0 != 0) goto La
            return
        La:
            int r2 = zzf(r2, r3)
            int r2 = r2 + 1
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r2 = r0.putInt(r3, r2)
            r2.commit()
            return
    }
}
