package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzhp {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzht zza;
    private final java.lang.String zzb;
    private final long zzc;
    private boolean zzd;
    private long zze;

    public zzhp(com.google.android.gms.measurement.internal.zzht r1, java.lang.String r2, long r3) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    public final long zza() {
            r4 = this;
            boolean r0 = r4.zzd
            if (r0 != 0) goto L17
            r0 = 1
            r4.zzd = r0
            com.google.android.gms.measurement.internal.zzht r0 = r4.zza
            java.lang.String r1 = r4.zzb
            long r2 = r4.zzc
            android.content.SharedPreferences r0 = r0.zzb()
            long r0 = r0.getLong(r1, r2)
            r4.zze = r0
        L17:
            long r0 = r4.zze
            return r0
    }

    public final void zzb(long r3) {
            r2 = this;
            com.google.android.gms.measurement.internal.zzht r0 = r2.zza
            android.content.SharedPreferences r0 = r0.zzb()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = r2.zzb
            r0.putLong(r1, r3)
            r0.apply()
            r2.zze = r3
            return
    }
}
