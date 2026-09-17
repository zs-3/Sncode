package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzhh extends com.google.android.gms.internal.auth.zzhi {
    zzhh(sun.misc.Unsafe r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final double zza(java.lang.Object r2, long r3) {
            r1 = this;
            sun.misc.Unsafe r0 = r1.zza
            long r2 = r0.getLong(r2, r3)
            double r2 = java.lang.Double.longBitsToDouble(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final float zzb(java.lang.Object r2, long r3) {
            r1 = this;
            sun.misc.Unsafe r0 = r1.zza
            int r2 = r0.getInt(r2, r3)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final void zzc(java.lang.Object r2, long r3, boolean r5) {
            r1 = this;
            boolean r0 = com.google.android.gms.internal.auth.zzhj.zza
            if (r0 == 0) goto L8
            com.google.android.gms.internal.auth.zzhj.zzi(r2, r3, r5)
            return
        L8:
            com.google.android.gms.internal.auth.zzhj.zzj(r2, r3, r5)
            return
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final void zzd(java.lang.Object r7, long r8, double r10) {
            r6 = this;
            long r4 = java.lang.Double.doubleToLongBits(r10)
            sun.misc.Unsafe r0 = r6.zza
            r1 = r7
            r2 = r8
            r0.putLong(r1, r2, r4)
            return
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final void zze(java.lang.Object r2, long r3, float r5) {
            r1 = this;
            int r5 = java.lang.Float.floatToIntBits(r5)
            sun.misc.Unsafe r0 = r1.zza
            r0.putInt(r2, r3, r5)
            return
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final boolean zzf(java.lang.Object r2, long r3) {
            r1 = this;
            boolean r0 = com.google.android.gms.internal.auth.zzhj.zza
            if (r0 == 0) goto L9
            boolean r2 = com.google.android.gms.internal.auth.zzhj.zzq(r2, r3)
            return r2
        L9:
            boolean r2 = com.google.android.gms.internal.auth.zzhj.zzr(r2, r3)
            return r2
    }
}
