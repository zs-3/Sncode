package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzamp implements com.google.android.gms.internal.ads.zzakq {
    private final java.util.List zza;
    private final long[] zzb;
    private final long[] zzc;

    public zzamp(java.util.List r7) {
            r6 = this;
            r6.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r7)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r6.zza = r0
            int r0 = r7.size()
            int r0 = r0 + r0
            long[] r0 = new long[r0]
            r6.zzb = r0
            r0 = 0
        L18:
            int r1 = r7.size()
            if (r0 >= r1) goto L35
            java.lang.Object r1 = r7.get(r0)
            com.google.android.gms.internal.ads.zzame r1 = (com.google.android.gms.internal.ads.zzame) r1
            long[] r2 = r6.zzb
            long r3 = r1.zzb
            int r5 = r0 + r0
            r2[r5] = r3
            int r5 = r5 + 1
            long r3 = r1.zzc
            r2[r5] = r3
            int r0 = r0 + 1
            goto L18
        L35:
            long[] r7 = r6.zzb
            int r0 = r7.length
            long[] r7 = java.util.Arrays.copyOf(r7, r0)
            r6.zzc = r7
            java.util.Arrays.sort(r7)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzakq
    public final int zza() {
            r1 = this;
            long[] r0 = r1.zzc
            int r0 = r0.length
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzakq
    public final long zzb(int r4) {
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 < 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            com.google.android.gms.internal.ads.zzdi.zzd(r2)
            long[] r2 = r3.zzc
            int r2 = r2.length
            if (r4 >= r2) goto L10
            goto L11
        L10:
            r0 = 0
        L11:
            com.google.android.gms.internal.ads.zzdi.zzd(r0)
            long[] r0 = r3.zzc
            r1 = r0[r4]
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzakq
    public final java.util.List zzc(long r10) {
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = 0
        Lc:
            java.util.List r4 = r9.zza
            int r4 = r4.size()
            if (r3 >= r4) goto L43
            long[] r4 = r9.zzb
            int r5 = r3 + r3
            r6 = r4[r5]
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 > 0) goto L40
            int r5 = r5 + 1
            r5 = r4[r5]
            int r4 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r4 >= 0) goto L40
            java.util.List r4 = r9.zza
            java.lang.Object r4 = r4.get(r3)
            com.google.android.gms.internal.ads.zzame r4 = (com.google.android.gms.internal.ads.zzame) r4
            com.google.android.gms.internal.ads.zzdb r5 = r4.zza
            float r6 = r5.zze
            r7 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 != 0) goto L3d
            r1.add(r4)
            goto L40
        L3d:
            r0.add(r5)
        L40:
            int r3 = r3 + 1
            goto Lc
        L43:
            com.google.android.gms.internal.ads.zzamo r10 = new com.google.android.gms.internal.ads.zzamo
            r10.<init>()
            java.util.Collections.sort(r1, r10)
        L4b:
            int r10 = r1.size()
            if (r2 >= r10) goto L6e
            java.lang.Object r10 = r1.get(r2)
            com.google.android.gms.internal.ads.zzame r10 = (com.google.android.gms.internal.ads.zzame) r10
            com.google.android.gms.internal.ads.zzdb r10 = r10.zza
            com.google.android.gms.internal.ads.zzcz r10 = r10.zzb()
            int r11 = (-1) - r2
            float r11 = (float) r11
            r3 = 1
            r10.zze(r11, r3)
            com.google.android.gms.internal.ads.zzdb r10 = r10.zzp()
            r0.add(r10)
            int r2 = r2 + 1
            goto L4b
        L6e:
            return r0
    }
}
