package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
abstract class zzgen extends com.google.android.gms.internal.ads.zzget {
    private static final com.google.android.gms.internal.ads.zzgfy zza = null;
    private com.google.android.gms.internal.ads.zzgas zzb;
    private final boolean zzc;
    private final boolean zzf;

    static {
            com.google.android.gms.internal.ads.zzgfy r0 = new com.google.android.gms.internal.ads.zzgfy
            java.lang.Class<com.google.android.gms.internal.ads.zzgen> r1 = com.google.android.gms.internal.ads.zzgen.class
            r0.<init>(r1)
            com.google.android.gms.internal.ads.zzgen.zza = r0
            return
    }

    zzgen(com.google.android.gms.internal.ads.zzgas r2, boolean r3, boolean r4) {
            r1 = this;
            int r0 = r2.size()
            r1.<init>(r0)
            r1.zzb = r2
            r1.zzc = r3
            r1.zzf = r4
            return
    }

    private final void zzG(int r1, java.util.concurrent.Future r2) {
            r0 = this;
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzggq.zza(r2)     // Catch: java.lang.Throwable -> L8 java.util.concurrent.ExecutionException -> Ld
            r0.zzf(r1, r2)     // Catch: java.lang.Throwable -> L8 java.util.concurrent.ExecutionException -> Ld
            return
        L8:
            r1 = move-exception
            r0.zzI(r1)
            return
        Ld:
            r1 = move-exception
            java.lang.Throwable r1 = r1.getCause()
            r0.zzI(r1)
            return
    }

    private final void zzH(com.google.android.gms.internal.ads.zzgas r5) {
            r4 = this;
            int r0 = r4.zzA()
            r1 = 0
            if (r0 < 0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            java.lang.String r3 = "Less than 0 remaining futures"
            com.google.android.gms.internal.ads.zzfxz.zzk(r2, r3)
            if (r0 != 0) goto L39
            if (r5 == 0) goto L2f
            com.google.android.gms.internal.ads.zzgdd r5 = r5.zze()
        L17:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r5.next()
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0
            boolean r2 = r0.isCancelled()
            if (r2 != 0) goto L2c
            r4.zzG(r1, r0)
        L2c:
            int r1 = r1 + 1
            goto L17
        L2f:
            r4.zzF()
            r4.zzu()
            r5 = 2
            r4.zzy(r5)
        L39:
            return
    }

    private final void zzI(java.lang.Throwable r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            boolean r0 = r1.zzc
            if (r0 == 0) goto L1c
            boolean r0 = r1.zzd(r2)
            if (r0 != 0) goto L1c
            java.util.Set r0 = r1.zzC()
            boolean r0 = zzL(r0, r2)
            if (r0 != 0) goto L18
            goto L1c
        L18:
            zzJ(r2)
            return
        L1c:
            boolean r0 = r2 instanceof java.lang.Error
            if (r0 == 0) goto L23
            zzJ(r2)
        L23:
            return
    }

    private static void zzJ(java.lang.Throwable r7) {
            boolean r0 = r7 instanceof java.lang.Error
            r1 = 1
            if (r1 == r0) goto L8
            java.lang.String r0 = "Got more than one input Future failure. Logging failures after the first"
            goto La
        L8:
            java.lang.String r0 = "Input Future failed with Error"
        La:
            r5 = r0
            com.google.android.gms.internal.ads.zzgfy r0 = com.google.android.gms.internal.ads.zzgen.zza
            java.util.logging.Logger r1 = r0.zza()
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "com.google.common.util.concurrent.AggregateFuture"
            java.lang.String r4 = "log"
            r6 = r7
            r1.logp(r2, r3, r4, r5, r6)
            return
    }

    private final void zzK(int r3, com.google.common.util.concurrent.ListenableFuture r4) {
            r2 = this;
            r0 = 0
            boolean r1 = r4.isCancelled()     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto Le
            r2.zzb = r0     // Catch: java.lang.Throwable -> L15
            r3 = 0
            r2.cancel(r3)     // Catch: java.lang.Throwable -> L15
            goto L11
        Le:
            r2.zzG(r3, r4)     // Catch: java.lang.Throwable -> L15
        L11:
            r2.zzH(r0)
            return
        L15:
            r3 = move-exception
            r2.zzH(r0)
            throw r3
    }

    private static boolean zzL(java.util.Set r1, java.lang.Throwable r2) {
        L0:
            if (r2 == 0) goto Lf
            boolean r0 = r1.add(r2)
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            java.lang.Throwable r2 = r2.getCause()
            goto L0
        Lf:
            r1 = 1
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzgec
    protected final java.lang.String zza() {
            r2 = this;
            com.google.android.gms.internal.ads.zzgas r0 = r2.zzb
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "futures="
            java.lang.String r0 = r1.concat(r0)
            return r0
        Lf:
            java.lang.String r0 = super.zza()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzgec
    protected final void zzb() {
            r3 = this;
            com.google.android.gms.internal.ads.zzgas r0 = r3.zzb
            r1 = 1
            r3.zzy(r1)
            boolean r2 = r3.isCancelled()
            if (r0 == 0) goto Ld
            goto Le
        Ld:
            r1 = 0
        Le:
            r1 = r1 & r2
            if (r1 == 0) goto L29
            boolean r1 = r3.zzt()
            com.google.android.gms.internal.ads.zzgdd r0 = r0.zze()
        L19:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r0.next()
            java.util.concurrent.Future r2 = (java.util.concurrent.Future) r2
            r2.cancel(r1)
            goto L19
        L29:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzget
    final void zze(java.util.Set r3) {
            r2 = this;
            java.util.Objects.requireNonNull(r3)
            boolean r0 = r2.isCancelled()
            if (r0 != 0) goto L16
            java.lang.Throwable r0 = r2.zzl()
            java.util.Objects.requireNonNull(r0)
            r1 = r0
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            zzL(r3, r0)
        L16:
            return
    }

    abstract void zzf(int r1, java.lang.Object r2);

    abstract void zzu();

    final void zzv() {
            r5 = this;
            com.google.android.gms.internal.ads.zzgas r0 = r5.zzb
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.zzgas r0 = r5.zzb
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
            r5.zzu()
            return
        L11:
            boolean r0 = r5.zzc
            if (r0 == 0) goto L40
            com.google.android.gms.internal.ads.zzgas r0 = r5.zzb
            com.google.android.gms.internal.ads.zzgdd r0 = r0.zze()
            r1 = 0
        L1c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r0.next()
            com.google.common.util.concurrent.ListenableFuture r2 = (com.google.common.util.concurrent.ListenableFuture) r2
            int r3 = r1 + 1
            boolean r4 = r2.isDone()
            if (r4 == 0) goto L34
            r5.zzK(r1, r2)
            goto L3e
        L34:
            com.google.android.gms.internal.ads.zzgel r4 = new com.google.android.gms.internal.ads.zzgel
            r4.<init>(r5, r1, r2)
            com.google.android.gms.internal.ads.zzgfc r1 = com.google.android.gms.internal.ads.zzgfc.zza
            r2.addListener(r4, r1)
        L3e:
            r1 = r3
            goto L1c
        L40:
            boolean r0 = r5.zzf
            if (r0 == 0) goto L47
            com.google.android.gms.internal.ads.zzgas r0 = r5.zzb
            goto L48
        L47:
            r0 = 0
        L48:
            com.google.android.gms.internal.ads.zzgem r1 = new com.google.android.gms.internal.ads.zzgem
            r1.<init>(r5, r0)
            com.google.android.gms.internal.ads.zzgas r2 = r5.zzb
            com.google.android.gms.internal.ads.zzgdd r2 = r2.zze()
        L53:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6f
            java.lang.Object r3 = r2.next()
            com.google.common.util.concurrent.ListenableFuture r3 = (com.google.common.util.concurrent.ListenableFuture) r3
            boolean r4 = r3.isDone()
            if (r4 == 0) goto L69
            r5.zzH(r0)
            goto L53
        L69:
            com.google.android.gms.internal.ads.zzgfc r4 = com.google.android.gms.internal.ads.zzgfc.zza
            r3.addListener(r1, r4)
            goto L53
        L6f:
            return
    }

    final /* synthetic */ void zzw(int r1, com.google.common.util.concurrent.ListenableFuture r2) {
            r0 = this;
            r0.zzK(r1, r2)
            return
    }

    final /* synthetic */ void zzx(com.google.android.gms.internal.ads.zzgas r1) {
            r0 = this;
            r0.zzH(r1)
            return
    }

    void zzy(int r1) {
            r0 = this;
            r1 = 0
            r0.zzb = r1
            return
    }
}
