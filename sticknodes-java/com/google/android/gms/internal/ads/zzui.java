package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzui implements com.google.android.gms.internal.ads.zzwp {
    private final com.google.android.gms.internal.ads.zzgax zza;
    private long zzb;

    public zzui(java.util.List r6, java.util.List r7) {
            r5 = this;
            r5.<init>()
            com.google.android.gms.internal.ads.zzgau r0 = new com.google.android.gms.internal.ads.zzgau
            r0.<init>()
            int r1 = r6.size()
            int r2 = r7.size()
            r3 = 0
            if (r1 != r2) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            com.google.android.gms.internal.ads.zzdi.zzd(r1)
        L19:
            int r1 = r6.size()
            if (r3 >= r1) goto L36
            com.google.android.gms.internal.ads.zzuh r1 = new com.google.android.gms.internal.ads.zzuh
            java.lang.Object r2 = r6.get(r3)
            com.google.android.gms.internal.ads.zzwp r2 = (com.google.android.gms.internal.ads.zzwp) r2
            java.lang.Object r4 = r7.get(r3)
            java.util.List r4 = (java.util.List) r4
            r1.<init>(r2, r4)
            r0.zzf(r1)
            int r3 = r3 + 1
            goto L19
        L36:
            com.google.android.gms.internal.ads.zzgax r6 = r0.zzi()
            r5.zza = r6
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.zzb = r6
            return
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final long zzb() {
            r14 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = 0
            r3 = r0
            r5 = r3
        L8:
            com.google.android.gms.internal.ads.zzgax r7 = r14.zza
            int r7 = r7.size()
            r8 = -9223372036854775808
            if (r2 >= r7) goto L5e
            com.google.android.gms.internal.ads.zzgax r7 = r14.zza
            java.lang.Object r7 = r7.get(r2)
            com.google.android.gms.internal.ads.zzuh r7 = (com.google.android.gms.internal.ads.zzuh) r7
            long r10 = r7.zzb()
            com.google.android.gms.internal.ads.zzgax r12 = r7.zza()
            r13 = 1
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            boolean r12 = r12.contains(r13)
            if (r12 != 0) goto L4b
            com.google.android.gms.internal.ads.zzgax r12 = r7.zza()
            r13 = 2
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            boolean r12 = r12.contains(r13)
            if (r12 != 0) goto L4b
            com.google.android.gms.internal.ads.zzgax r7 = r7.zza()
            r12 = 4
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            boolean r7 = r7.contains(r12)
            if (r7 == 0) goto L53
        L4b:
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 == 0) goto L53
            long r3 = java.lang.Math.min(r3, r10)
        L53:
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 == 0) goto L5b
            long r5 = java.lang.Math.min(r5, r10)
        L5b:
            int r2 = r2 + 1
            goto L8
        L5e:
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L65
            r14.zzb = r3
            return r3
        L65:
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 == 0) goto L76
            long r0 = r14.zzb
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L75
            return r0
        L75:
            return r5
        L76:
            return r8
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final long zzc() {
            r10 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = 0
            r3 = r0
        L7:
            com.google.android.gms.internal.ads.zzgax r5 = r10.zza
            int r5 = r5.size()
            r6 = -9223372036854775808
            if (r2 >= r5) goto L28
            com.google.android.gms.internal.ads.zzgax r5 = r10.zza
            java.lang.Object r5 = r5.get(r2)
            com.google.android.gms.internal.ads.zzuh r5 = (com.google.android.gms.internal.ads.zzuh) r5
            long r8 = r5.zzc()
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 == 0) goto L25
            long r3 = java.lang.Math.min(r3, r8)
        L25:
            int r2 = r2 + 1
            goto L7
        L28:
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L2d
            return r6
        L2d:
            return r3
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final void zzm(long r3) {
            r2 = this;
            r0 = 0
        L1:
            com.google.android.gms.internal.ads.zzgax r1 = r2.zza
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            com.google.android.gms.internal.ads.zzgax r1 = r2.zza
            java.lang.Object r1 = r1.get(r0)
            com.google.android.gms.internal.ads.zzuh r1 = (com.google.android.gms.internal.ads.zzuh) r1
            r1.zzm(r3)
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final boolean zzo(com.google.android.gms.internal.ads.zzks r14) {
            r13 = this;
            r0 = 0
            r1 = 0
        L2:
            long r2 = r13.zzc()
            r4 = -9223372036854775808
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L48
            r6 = 0
            r7 = 0
        Le:
            com.google.android.gms.internal.ads.zzgax r8 = r13.zza
            int r8 = r8.size()
            if (r6 >= r8) goto L45
            com.google.android.gms.internal.ads.zzgax r8 = r13.zza
            java.lang.Object r8 = r8.get(r6)
            com.google.android.gms.internal.ads.zzuh r8 = (com.google.android.gms.internal.ads.zzuh) r8
            long r8 = r8.zzc()
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 == 0) goto L2e
            long r10 = r14.zza
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 > 0) goto L2e
            r10 = 1
            goto L2f
        L2e:
            r10 = 0
        L2f:
            int r11 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r11 == 0) goto L35
            if (r10 == 0) goto L42
        L35:
            com.google.android.gms.internal.ads.zzgax r8 = r13.zza
            java.lang.Object r8 = r8.get(r6)
            com.google.android.gms.internal.ads.zzuh r8 = (com.google.android.gms.internal.ads.zzuh) r8
            boolean r8 = r8.zzo(r14)
            r7 = r7 | r8
        L42:
            int r6 = r6 + 1
            goto Le
        L45:
            r1 = r1 | r7
            if (r7 != 0) goto L2
        L48:
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzwp
    public final boolean zzp() {
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            com.google.android.gms.internal.ads.zzgax r2 = r3.zza
            int r2 = r2.size()
            if (r1 >= r2) goto L1d
            com.google.android.gms.internal.ads.zzgax r2 = r3.zza
            java.lang.Object r2 = r2.get(r1)
            com.google.android.gms.internal.ads.zzuh r2 = (com.google.android.gms.internal.ads.zzuh) r2
            boolean r2 = r2.zzp()
            if (r2 == 0) goto L1a
            r0 = 1
            return r0
        L1a:
            int r1 = r1 + 1
            goto L2
        L1d:
            return r0
    }
}
