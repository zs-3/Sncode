package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgvn extends com.google.android.gms.internal.ads.zzhbe implements com.google.android.gms.internal.ads.zzhcq {
    private static final com.google.android.gms.internal.ads.zzgvn zza = null;
    private static volatile com.google.android.gms.internal.ads.zzhcx zzb;

    static {
            com.google.android.gms.internal.ads.zzgvn r0 = new com.google.android.gms.internal.ads.zzgvn
            r0.<init>()
            com.google.android.gms.internal.ads.zzgvn.zza = r0
            java.lang.Class<com.google.android.gms.internal.ads.zzgvn> r1 = com.google.android.gms.internal.ads.zzgvn.class
            com.google.android.gms.internal.ads.zzhbe.zzcb(r1, r0)
            return
    }

    private zzgvn() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzgvn zza() {
            com.google.android.gms.internal.ads.zzgvn r0 = com.google.android.gms.internal.ads.zzgvn.zza
            return r0
    }

    public static com.google.android.gms.internal.ads.zzgvn zzc() {
            com.google.android.gms.internal.ads.zzgvn r0 = com.google.android.gms.internal.ads.zzgvn.zza
            return r0
    }

    public static com.google.android.gms.internal.ads.zzgvn zzd(com.google.android.gms.internal.ads.zzgzs r1, com.google.android.gms.internal.ads.zzhao r2) throws com.google.android.gms.internal.ads.zzhbt {
            com.google.android.gms.internal.ads.zzgvn r0 = com.google.android.gms.internal.ads.zzgvn.zza
            com.google.android.gms.internal.ads.zzhbe r1 = com.google.android.gms.internal.ads.zzhbe.zzbr(r0, r1, r2)
            com.google.android.gms.internal.ads.zzgvn r1 = (com.google.android.gms.internal.ads.zzgvn) r1
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    protected final java.lang.Object zzde(com.google.android.gms.internal.ads.zzhbd r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            int r1 = r1.ordinal()
            r2 = 0
            switch(r1) {
                case 0: goto L41;
                case 1: goto L40;
                case 2: goto L37;
                case 3: goto L31;
                case 4: goto L2b;
                case 5: goto L28;
                case 6: goto Le;
                default: goto L8;
            }
        L8:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
        Le:
            com.google.android.gms.internal.ads.zzhcx r1 = com.google.android.gms.internal.ads.zzgvn.zzb
            if (r1 != 0) goto L27
            java.lang.Class<com.google.android.gms.internal.ads.zzgvn> r2 = com.google.android.gms.internal.ads.zzgvn.class
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzhcx r1 = com.google.android.gms.internal.ads.zzgvn.zzb     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L22
            com.google.android.gms.internal.ads.zzhaz r1 = new com.google.android.gms.internal.ads.zzhaz     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.internal.ads.zzgvn r3 = com.google.android.gms.internal.ads.zzgvn.zza     // Catch: java.lang.Throwable -> L24
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.internal.ads.zzgvn.zzb = r1     // Catch: java.lang.Throwable -> L24
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L24
            goto L27
        L24:
            r1 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L24
            throw r1
        L27:
            return r1
        L28:
            com.google.android.gms.internal.ads.zzgvn r1 = com.google.android.gms.internal.ads.zzgvn.zza
            return r1
        L2b:
            com.google.android.gms.internal.ads.zzgvm r1 = new com.google.android.gms.internal.ads.zzgvm
            r1.<init>(r2)
            return r1
        L31:
            com.google.android.gms.internal.ads.zzgvn r1 = new com.google.android.gms.internal.ads.zzgvn
            r1.<init>()
            return r1
        L37:
            com.google.android.gms.internal.ads.zzgvn r1 = com.google.android.gms.internal.ads.zzgvn.zza
            java.lang.String r3 = "\u0000\u0000"
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzhbe.zzbS(r1, r3, r2)
            return r1
        L40:
            return r2
        L41:
            r1 = 1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            return r1
    }
}
