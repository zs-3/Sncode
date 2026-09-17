package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzhed extends com.google.android.gms.internal.ads.zzhee {
    zzhed(sun.misc.Unsafe r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhee
    public final byte zza(long r1) {
            r0 = this;
            byte r1 = libcore.io.Memory.peekByte(r1)
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzhee
    public final double zzb(java.lang.Object r2, long r3) {
            r1 = this;
            sun.misc.Unsafe r0 = r1.zza
            long r2 = r0.getLong(r2, r3)
            double r2 = java.lang.Double.longBitsToDouble(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzhee
    public final float zzc(java.lang.Object r2, long r3) {
            r1 = this;
            sun.misc.Unsafe r0 = r1.zza
            int r2 = r0.getInt(r2, r3)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            return r2
    }

    @Override // com.google.android.gms.internal.ads.zzhee
    public final void zzd(long r1, byte[] r3, long r4, long r6) {
            r0 = this;
            int r5 = (int) r4
            int r4 = (int) r6
            libcore.io.Memory.peekByteArray(r1, r3, r5, r4)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhee
    public final void zze(java.lang.Object r2, long r3, boolean r5) {
            r1 = this;
            boolean r0 = com.google.android.gms.internal.ads.zzhef.zzb
            if (r0 == 0) goto L8
            com.google.android.gms.internal.ads.zzhef.zzk(r2, r3, r5)
            return
        L8:
            com.google.android.gms.internal.ads.zzhef.zzl(r2, r3, r5)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhee
    public final void zzf(java.lang.Object r2, long r3, byte r5) {
            r1 = this;
            boolean r0 = com.google.android.gms.internal.ads.zzhef.zzb
            if (r0 == 0) goto L8
            com.google.android.gms.internal.ads.zzhef.zzm(r2, r3, r5)
            return
        L8:
            com.google.android.gms.internal.ads.zzhef.zzn(r2, r3, r5)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhee
    public final void zzg(java.lang.Object r7, long r8, double r10) {
            r6 = this;
            long r4 = java.lang.Double.doubleToLongBits(r10)
            sun.misc.Unsafe r0 = r6.zza
            r1 = r7
            r2 = r8
            r0.putLong(r1, r2, r4)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhee
    public final void zzh(java.lang.Object r2, long r3, float r5) {
            r1 = this;
            int r5 = java.lang.Float.floatToIntBits(r5)
            sun.misc.Unsafe r0 = r1.zza
            r0.putInt(r2, r3, r5)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzhee
    public final boolean zzi(java.lang.Object r2, long r3) {
            r1 = this;
            boolean r0 = com.google.android.gms.internal.ads.zzhef.zzb
            if (r0 == 0) goto L9
            boolean r2 = com.google.android.gms.internal.ads.zzhef.zzw(r2, r3)
            return r2
        L9:
            boolean r2 = com.google.android.gms.internal.ads.zzhef.zzx(r2, r3)
            return r2
    }
}
