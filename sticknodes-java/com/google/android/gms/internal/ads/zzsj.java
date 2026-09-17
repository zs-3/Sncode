package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzsj extends android.media.MediaCodec.Callback {
    private final java.lang.Object zza;
    private final android.os.HandlerThread zzb;
    private android.os.Handler zzc;
    private final androidx.collection.CircularIntArray zzd;
    private final androidx.collection.CircularIntArray zze;
    private final java.util.ArrayDeque zzf;
    private final java.util.ArrayDeque zzg;
    private android.media.MediaFormat zzh;
    private android.media.MediaFormat zzi;
    private android.media.MediaCodec.CodecException zzj;
    private android.media.MediaCodec.CryptoException zzk;
    private long zzl;
    private boolean zzm;
    private java.lang.IllegalStateException zzn;
    private com.google.android.gms.internal.ads.zzss zzo;

    zzsj(android.os.HandlerThread r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zza = r0
            r1.zzb = r2
            androidx.collection.CircularIntArray r2 = new androidx.collection.CircularIntArray
            r2.<init>()
            r1.zzd = r2
            androidx.collection.CircularIntArray r2 = new androidx.collection.CircularIntArray
            r2.<init>()
            r1.zze = r2
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r1.zzf = r2
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r1.zzg = r2
            return
    }

    public static /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzsj r6) {
            java.lang.Object r0 = r6.zza
            monitor-enter(r0)
            boolean r1 = r6.zzm     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            return
        L9:
            long r1 = r6.zzl     // Catch: java.lang.Throwable -> L2f
            r3 = -1
            long r1 = r1 + r3
            r6.zzl = r1     // Catch: java.lang.Throwable -> L2f
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            return
        L18:
            if (r5 >= 0) goto L2a
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2f
            r1.<init>()     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r2 = r6.zza     // Catch: java.lang.Throwable -> L2f
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L2f
            r6.zzn = r1     // Catch: java.lang.Throwable -> L27
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            return
        L27:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L27
            throw r6     // Catch: java.lang.Throwable -> L2f
        L2a:
            r6.zzj()     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            return
        L2f:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r6
    }

    private final void zzi(android.media.MediaFormat r3) {
            r2 = this;
            androidx.collection.CircularIntArray r0 = r2.zze
            r1 = -2
            r0.addLast(r1)
            java.util.ArrayDeque r0 = r2.zzg
            r0.add(r3)
            return
    }

    private final void zzj() {
            r1 = this;
            java.util.ArrayDeque r0 = r1.zzg
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L12
            java.util.ArrayDeque r0 = r1.zzg
            java.lang.Object r0 = r0.getLast()
            android.media.MediaFormat r0 = (android.media.MediaFormat) r0
            r1.zzi = r0
        L12:
            androidx.collection.CircularIntArray r0 = r1.zzd
            r0.clear()
            androidx.collection.CircularIntArray r0 = r1.zze
            r0.clear()
            java.util.ArrayDeque r0 = r1.zzf
            r0.clear()
            java.util.ArrayDeque r0 = r1.zzg
            r0.clear()
            return
    }

    private final void zzk() {
            r2 = this;
            java.lang.IllegalStateException r0 = r2.zzn
            r1 = 0
            if (r0 != 0) goto L14
            android.media.MediaCodec$CodecException r0 = r2.zzj
            if (r0 != 0) goto L11
            android.media.MediaCodec$CryptoException r0 = r2.zzk
            if (r0 != 0) goto Le
            return
        Le:
            r2.zzk = r1
            throw r0
        L11:
            r2.zzj = r1
            throw r0
        L14:
            r2.zzn = r1
            throw r0
    }

    private final boolean zzl() {
            r5 = this;
            long r0 = r5.zzl
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto Lf
            boolean r0 = r5.zzm
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(android.media.MediaCodec r1, android.media.MediaCodec.CryptoException r2) {
            r0 = this;
            java.lang.Object r1 = r0.zza
            monitor-enter(r1)
            r0.zzk = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(android.media.MediaCodec r1, android.media.MediaCodec.CodecException r2) {
            r0 = this;
            java.lang.Object r1 = r0.zza
            monitor-enter(r1)
            r0.zzj = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(android.media.MediaCodec r2, int r3) {
            r1 = this;
            java.lang.Object r2 = r1.zza
            monitor-enter(r2)
            androidx.collection.CircularIntArray r0 = r1.zzd     // Catch: java.lang.Throwable -> L1f
            r0.addLast(r3)     // Catch: java.lang.Throwable -> L1f
            com.google.android.gms.internal.ads.zzss r3 = r1.zzo     // Catch: java.lang.Throwable -> L1f
            if (r3 == 0) goto L1d
            com.google.android.gms.internal.ads.zztc r3 = (com.google.android.gms.internal.ads.zztc) r3     // Catch: java.lang.Throwable -> L1f
            com.google.android.gms.internal.ads.zzte r3 = r3.zza     // Catch: java.lang.Throwable -> L1f
            com.google.android.gms.internal.ads.zzlq r0 = com.google.android.gms.internal.ads.zzte.zzax(r3)     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L1d
            com.google.android.gms.internal.ads.zzlq r3 = com.google.android.gms.internal.ads.zzte.zzax(r3)     // Catch: java.lang.Throwable -> L1f
            r3.zza()     // Catch: java.lang.Throwable -> L1f
        L1d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1f
            return
        L1f:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1f
            throw r3
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(android.media.MediaCodec r2, int r3, android.media.MediaCodec.BufferInfo r4) {
            r1 = this;
            java.lang.Object r2 = r1.zza
            monitor-enter(r2)
            android.media.MediaFormat r0 = r1.zzi     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto Ld
            r1.zzi(r0)     // Catch: java.lang.Throwable -> L2e
            r0 = 0
            r1.zzi = r0     // Catch: java.lang.Throwable -> L2e
        Ld:
            androidx.collection.CircularIntArray r0 = r1.zze     // Catch: java.lang.Throwable -> L2e
            r0.addLast(r3)     // Catch: java.lang.Throwable -> L2e
            java.util.ArrayDeque r3 = r1.zzf     // Catch: java.lang.Throwable -> L2e
            r3.add(r4)     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.zzss r3 = r1.zzo     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L2c
            com.google.android.gms.internal.ads.zztc r3 = (com.google.android.gms.internal.ads.zztc) r3     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.zzte r3 = r3.zza     // Catch: java.lang.Throwable -> L2e
            com.google.android.gms.internal.ads.zzlq r4 = com.google.android.gms.internal.ads.zzte.zzax(r3)     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L2c
            com.google.android.gms.internal.ads.zzlq r3 = com.google.android.gms.internal.ads.zzte.zzax(r3)     // Catch: java.lang.Throwable -> L2e
            r3.zza()     // Catch: java.lang.Throwable -> L2e
        L2c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
            return
        L2e:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
            throw r3
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(android.media.MediaCodec r1, android.media.MediaFormat r2) {
            r0 = this;
            java.lang.Object r1 = r0.zza
            monitor-enter(r1)
            r0.zzi(r2)     // Catch: java.lang.Throwable -> Lb
            r2 = 0
            r0.zzi = r2     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    public final int zza() {
            r3 = this;
            java.lang.Object r0 = r3.zza
            monitor-enter(r0)
            r3.zzk()     // Catch: java.lang.Throwable -> L20
            boolean r1 = r3.zzl()     // Catch: java.lang.Throwable -> L20
            r2 = -1
            if (r1 == 0) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return r2
        Lf:
            androidx.collection.CircularIntArray r1 = r3.zzd     // Catch: java.lang.Throwable -> L20
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L18
            goto L1e
        L18:
            androidx.collection.CircularIntArray r1 = r3.zzd     // Catch: java.lang.Throwable -> L20
            int r2 = r1.popFirst()     // Catch: java.lang.Throwable -> L20
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return r2
        L20:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r1
    }

    public final int zzb(android.media.MediaCodec.BufferInfo r10) {
            r9 = this;
            java.lang.Object r0 = r9.zza
            monitor-enter(r0)
            r9.zzk()     // Catch: java.lang.Throwable -> L4b
            boolean r1 = r9.zzl()     // Catch: java.lang.Throwable -> L4b
            r2 = -1
            if (r1 == 0) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4b
            return r2
        Lf:
            androidx.collection.CircularIntArray r1 = r9.zze     // Catch: java.lang.Throwable -> L4b
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L4b
            if (r1 == 0) goto L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4b
            return r2
        L19:
            androidx.collection.CircularIntArray r1 = r9.zze     // Catch: java.lang.Throwable -> L4b
            int r1 = r1.popFirst()     // Catch: java.lang.Throwable -> L4b
            r2 = -2
            if (r1 < 0) goto L3c
            android.media.MediaFormat r2 = r9.zzh     // Catch: java.lang.Throwable -> L4b
            com.google.android.gms.internal.ads.zzdi.zzb(r2)     // Catch: java.lang.Throwable -> L4b
            java.util.ArrayDeque r2 = r9.zzf     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r2 = r2.remove()     // Catch: java.lang.Throwable -> L4b
            android.media.MediaCodec$BufferInfo r2 = (android.media.MediaCodec.BufferInfo) r2     // Catch: java.lang.Throwable -> L4b
            int r4 = r2.offset     // Catch: java.lang.Throwable -> L4b
            int r5 = r2.size     // Catch: java.lang.Throwable -> L4b
            long r6 = r2.presentationTimeUs     // Catch: java.lang.Throwable -> L4b
            int r8 = r2.flags     // Catch: java.lang.Throwable -> L4b
            r3 = r10
            r3.set(r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L4b
            goto L49
        L3c:
            if (r1 != r2) goto L49
            java.util.ArrayDeque r10 = r9.zzg     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r10 = r10.remove()     // Catch: java.lang.Throwable -> L4b
            android.media.MediaFormat r10 = (android.media.MediaFormat) r10     // Catch: java.lang.Throwable -> L4b
            r9.zzh = r10     // Catch: java.lang.Throwable -> L4b
            r1 = -2
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4b
            return r1
        L4b:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4b
            throw r10
    }

    public final android.media.MediaFormat zzc() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            android.media.MediaFormat r1 = r2.zzh     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        L9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            throw r1     // Catch: java.lang.Throwable -> Lf
        Lf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public final void zze() {
            r5 = this;
            java.lang.Object r0 = r5.zza
            monitor-enter(r0)
            long r1 = r5.zzl     // Catch: java.lang.Throwable -> L18
            r3 = 1
            long r1 = r1 + r3
            r5.zzl = r1     // Catch: java.lang.Throwable -> L18
            android.os.Handler r1 = r5.zzc     // Catch: java.lang.Throwable -> L18
            int r2 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: java.lang.Throwable -> L18
            com.google.android.gms.internal.ads.zzsi r2 = new com.google.android.gms.internal.ads.zzsi     // Catch: java.lang.Throwable -> L18
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L18
            r1.post(r2)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return
        L18:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r1
    }

    public final void zzf(android.media.MediaCodec r3) {
            r2 = this;
            android.os.Handler r0 = r2.zzc
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            android.os.HandlerThread r0 = r2.zzb
            r0.start()
            android.os.HandlerThread r0 = r2.zzb
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r0 = r0.getLooper()
            r1.<init>(r0)
            r3.setCallback(r2, r1)
            r2.zzc = r1
            return
    }

    public final void zzg(com.google.android.gms.internal.ads.zzss r2) {
            r1 = this;
            java.lang.Object r0 = r1.zza
            monitor-enter(r0)
            r1.zzo = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    public final void zzh() {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            r1 = 1
            r2.zzm = r1     // Catch: java.lang.Throwable -> L10
            android.os.HandlerThread r1 = r2.zzb     // Catch: java.lang.Throwable -> L10
            r1.quit()     // Catch: java.lang.Throwable -> L10
            r2.zzj()     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }
}
