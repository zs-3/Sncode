package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzhn {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzht zza;
    private final java.lang.String zzb;
    private final boolean zzc;
    private boolean zzd;
    private boolean zze;

    public zzhn(com.google.android.gms.measurement.internal.zzht r1, java.lang.String r2, boolean r3) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    public final void zza(boolean r3) {
            r2 = this;
            com.google.android.gms.measurement.internal.zzht r0 = r2.zza
            android.content.SharedPreferences r0 = r0.zzb()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = r2.zzb
            r0.putBoolean(r1, r3)
            r0.apply()
            r2.zze = r3
            return
    }

    public final boolean zzb() {
            r3 = this;
            boolean r0 = r3.zzd
            if (r0 != 0) goto L17
            r0 = 1
            r3.zzd = r0
            com.google.android.gms.measurement.internal.zzht r0 = r3.zza
            java.lang.String r1 = r3.zzb
            boolean r2 = r3.zzc
            android.content.SharedPreferences r0 = r0.zzb()
            boolean r0 = r0.getBoolean(r1, r2)
            r3.zze = r0
        L17:
            boolean r0 = r3.zze
            return r0
    }
}
