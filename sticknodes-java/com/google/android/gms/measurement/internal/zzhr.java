package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzhr {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzht zza;
    private final java.lang.String zzb;
    private boolean zzc;
    private java.lang.String zzd;

    public zzhr(com.google.android.gms.measurement.internal.zzht r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)
            r0.zzb = r2
            return
    }

    public final java.lang.String zza() {
            r3 = this;
            boolean r0 = r3.zzc
            if (r0 != 0) goto L16
            r0 = 1
            r3.zzc = r0
            com.google.android.gms.measurement.internal.zzht r0 = r3.zza
            java.lang.String r1 = r3.zzb
            android.content.SharedPreferences r0 = r0.zzb()
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)
            r3.zzd = r0
        L16:
            java.lang.String r0 = r3.zzd
            return r0
    }

    public final void zzb(java.lang.String r3) {
            r2 = this;
            com.google.android.gms.measurement.internal.zzht r0 = r2.zza
            android.content.SharedPreferences r0 = r0.zzb()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = r2.zzb
            r0.putString(r1, r3)
            r0.apply()
            r2.zzd = r3
            return
    }
}
