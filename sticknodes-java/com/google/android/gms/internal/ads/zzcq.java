package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcq {
    private final com.google.android.gms.internal.ads.zzgax zza;
    private final java.util.List zzb;
    private java.nio.ByteBuffer[] zzc;
    private boolean zzd;

    public zzcq(com.google.android.gms.internal.ads.zzgax r2) {
            r1 = this;
            r1.<init>()
            r1.zza = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.zzb = r2
            r2 = 0
            java.nio.ByteBuffer[] r0 = new java.nio.ByteBuffer[r2]
            r1.zzc = r0
            com.google.android.gms.internal.ads.zzcr r0 = com.google.android.gms.internal.ads.zzcr.zza
            r1.zzd = r2
            return
    }

    private final int zzi() {
            r1 = this;
            java.nio.ByteBuffer[] r0 = r1.zzc
            int r0 = r0.length
            int r0 = r0 + (-1)
            return r0
    }

    private final void zzj(java.nio.ByteBuffer r10) {
            r9 = this;
            r0 = 0
        L1:
            r1 = 0
            r2 = 0
        L3:
            int r3 = r9.zzi()
            if (r1 > r3) goto L7f
            java.nio.ByteBuffer[] r3 = r9.zzc
            r3 = r3[r1]
            boolean r3 = r3.hasRemaining()
            if (r3 != 0) goto L7c
            java.util.List r3 = r9.zzb
            java.lang.Object r3 = r3.get(r1)
            com.google.android.gms.internal.ads.zzct r3 = (com.google.android.gms.internal.ads.zzct) r3
            boolean r4 = r3.zzh()
            if (r4 == 0) goto L3f
            java.nio.ByteBuffer[] r3 = r9.zzc
            r3 = r3[r1]
            boolean r3 = r3.hasRemaining()
            if (r3 != 0) goto L7c
            int r3 = r9.zzi()
            if (r1 >= r3) goto L7c
            java.util.List r3 = r9.zzb
            int r4 = r1 + 1
            java.lang.Object r3 = r3.get(r4)
            com.google.android.gms.internal.ads.zzct r3 = (com.google.android.gms.internal.ads.zzct) r3
            r3.zzd()
            goto L7c
        L3f:
            if (r1 <= 0) goto L48
            java.nio.ByteBuffer[] r4 = r9.zzc
            int r5 = r1 + (-1)
            r4 = r4[r5]
            goto L52
        L48:
            boolean r4 = r10.hasRemaining()
            if (r4 == 0) goto L50
            r4 = r10
            goto L52
        L50:
            java.nio.ByteBuffer r4 = com.google.android.gms.internal.ads.zzct.zza
        L52:
            int r5 = r4.remaining()
            long r5 = (long) r5
            r3.zze(r4)
            java.nio.ByteBuffer[] r7 = r9.zzc
            java.nio.ByteBuffer r3 = r3.zzb()
            r7[r1] = r3
            int r3 = r4.remaining()
            long r3 = (long) r3
            long r5 = r5 - r3
            r3 = 0
            r7 = 1
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 > 0) goto L7b
            java.nio.ByteBuffer[] r3 = r9.zzc
            r3 = r3[r1]
            boolean r3 = r3.hasRemaining()
            if (r3 == 0) goto L7a
            goto L7b
        L7a:
            r7 = 0
        L7b:
            r2 = r2 | r7
        L7c:
            int r1 = r1 + 1
            goto L3
        L7f:
            if (r2 == 0) goto L83
            goto L1
        L83:
            return
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof com.google.android.gms.internal.ads.zzcq
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.ads.zzcq r6 = (com.google.android.gms.internal.ads.zzcq) r6
            com.google.android.gms.internal.ads.zzgax r1 = r5.zza
            int r1 = r1.size()
            com.google.android.gms.internal.ads.zzgax r3 = r6.zza
            int r3 = r3.size()
            if (r1 != r3) goto L36
            r1 = 0
        L1b:
            com.google.android.gms.internal.ads.zzgax r3 = r5.zza
            int r3 = r3.size()
            if (r1 >= r3) goto L35
            com.google.android.gms.internal.ads.zzgax r3 = r5.zza
            java.lang.Object r3 = r3.get(r1)
            com.google.android.gms.internal.ads.zzgax r4 = r6.zza
            java.lang.Object r4 = r4.get(r1)
            if (r3 == r4) goto L32
            return r2
        L32:
            int r1 = r1 + 1
            goto L1b
        L35:
            return r0
        L36:
            return r2
    }

    public final int hashCode() {
            r1 = this;
            com.google.android.gms.internal.ads.zzgax r0 = r1.zza
            int r0 = r0.hashCode()
            return r0
    }

    public final com.google.android.gms.internal.ads.zzcr zza(com.google.android.gms.internal.ads.zzcr r4) throws com.google.android.gms.internal.ads.zzcs {
            r3 = this;
            com.google.android.gms.internal.ads.zzcr r0 = com.google.android.gms.internal.ads.zzcr.zza
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L33
            r0 = 0
        L9:
            com.google.android.gms.internal.ads.zzgax r1 = r3.zza
            int r1 = r1.size()
            if (r0 >= r1) goto L32
            com.google.android.gms.internal.ads.zzgax r1 = r3.zza
            java.lang.Object r1 = r1.get(r0)
            com.google.android.gms.internal.ads.zzct r1 = (com.google.android.gms.internal.ads.zzct) r1
            com.google.android.gms.internal.ads.zzcr r2 = r1.zza(r4)
            boolean r1 = r1.zzg()
            if (r1 == 0) goto L2f
            com.google.android.gms.internal.ads.zzcr r4 = com.google.android.gms.internal.ads.zzcr.zza
            boolean r4 = r2.equals(r4)
            r4 = r4 ^ 1
            com.google.android.gms.internal.ads.zzdi.zzf(r4)
            r4 = r2
        L2f:
            int r0 = r0 + 1
            goto L9
        L32:
            return r4
        L33:
            com.google.android.gms.internal.ads.zzcs r0 = new com.google.android.gms.internal.ads.zzcs
            java.lang.String r1 = "Unhandled input format:"
            r0.<init>(r1, r4)
            throw r0
    }

    public final java.nio.ByteBuffer zzb() {
            r2 = this;
            boolean r0 = r2.zzh()
            if (r0 != 0) goto L9
            java.nio.ByteBuffer r0 = com.google.android.gms.internal.ads.zzct.zza
            return r0
        L9:
            java.nio.ByteBuffer[] r0 = r2.zzc
            int r1 = r2.zzi()
            r0 = r0[r1]
            boolean r1 = r0.hasRemaining()
            if (r1 == 0) goto L18
            return r0
        L18:
            java.nio.ByteBuffer r0 = com.google.android.gms.internal.ads.zzct.zza
            r2.zzj(r0)
            java.nio.ByteBuffer[] r0 = r2.zzc
            int r1 = r2.zzi()
            r0 = r0[r1]
            return r0
    }

    public final void zzc() {
            r4 = this;
            java.util.List r0 = r4.zzb
            r0.clear()
            r0 = 0
            r4.zzd = r0
            r1 = 0
        L9:
            com.google.android.gms.internal.ads.zzgax r2 = r4.zza
            int r2 = r2.size()
            if (r1 >= r2) goto L2a
            com.google.android.gms.internal.ads.zzgax r2 = r4.zza
            java.lang.Object r2 = r2.get(r1)
            com.google.android.gms.internal.ads.zzct r2 = (com.google.android.gms.internal.ads.zzct) r2
            r2.zzc()
            boolean r3 = r2.zzg()
            if (r3 == 0) goto L27
            java.util.List r3 = r4.zzb
            r3.add(r2)
        L27:
            int r1 = r1 + 1
            goto L9
        L2a:
            java.util.List r1 = r4.zzb
            int r1 = r1.size()
            java.nio.ByteBuffer[] r1 = new java.nio.ByteBuffer[r1]
            r4.zzc = r1
        L34:
            int r1 = r4.zzi()
            if (r0 > r1) goto L4d
            java.nio.ByteBuffer[] r1 = r4.zzc
            java.util.List r2 = r4.zzb
            java.lang.Object r2 = r2.get(r0)
            com.google.android.gms.internal.ads.zzct r2 = (com.google.android.gms.internal.ads.zzct) r2
            java.nio.ByteBuffer r2 = r2.zzb()
            r1[r0] = r2
            int r0 = r0 + 1
            goto L34
        L4d:
            return
    }

    public final void zzd() {
            r2 = this;
            boolean r0 = r2.zzh()
            if (r0 == 0) goto L1a
            boolean r0 = r2.zzd
            if (r0 == 0) goto Lb
            goto L1a
        Lb:
            r0 = 1
            r2.zzd = r0
            java.util.List r0 = r2.zzb
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.ads.zzct r0 = (com.google.android.gms.internal.ads.zzct) r0
            r0.zzd()
        L1a:
            return
    }

    public final void zze(java.nio.ByteBuffer r2) {
            r1 = this;
            boolean r0 = r1.zzh()
            if (r0 == 0) goto Le
            boolean r0 = r1.zzd
            if (r0 == 0) goto Lb
            goto Le
        Lb:
            r1.zzj(r2)
        Le:
            return
    }

    public final void zzf() {
            r3 = this;
            r0 = 0
            r1 = 0
        L2:
            com.google.android.gms.internal.ads.zzgax r2 = r3.zza
            int r2 = r2.size()
            if (r1 >= r2) goto L1b
            com.google.android.gms.internal.ads.zzgax r2 = r3.zza
            java.lang.Object r2 = r2.get(r1)
            com.google.android.gms.internal.ads.zzct r2 = (com.google.android.gms.internal.ads.zzct) r2
            r2.zzc()
            r2.zzf()
            int r1 = r1 + 1
            goto L2
        L1b:
            java.nio.ByteBuffer[] r1 = new java.nio.ByteBuffer[r0]
            r3.zzc = r1
            com.google.android.gms.internal.ads.zzcr r1 = com.google.android.gms.internal.ads.zzcr.zza
            r3.zzd = r0
            return
    }

    public final boolean zzg() {
            r2 = this;
            boolean r0 = r2.zzd
            if (r0 == 0) goto L26
            java.util.List r0 = r2.zzb
            int r1 = r2.zzi()
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.ads.zzct r0 = (com.google.android.gms.internal.ads.zzct) r0
            boolean r0 = r0.zzh()
            if (r0 == 0) goto L26
            java.nio.ByteBuffer[] r0 = r2.zzc
            int r1 = r2.zzi()
            r0 = r0[r1]
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L26
            r0 = 1
            return r0
        L26:
            r0 = 0
            return r0
    }

    public final boolean zzh() {
            r1 = this;
            java.util.List r0 = r1.zzb
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }
}
