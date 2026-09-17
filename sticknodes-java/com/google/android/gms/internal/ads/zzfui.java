package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfui extends com.google.android.gms.internal.ads.zzftw {
    private com.google.android.gms.internal.ads.zzfyp<java.lang.Integer> zza;
    private com.google.android.gms.internal.ads.zzfyp<java.lang.Integer> zzb;
    private com.google.android.gms.internal.ads.zzfuh zzc;
    private java.net.HttpURLConnection zzd;

    zzfui() {
            r3 = this;
            com.google.android.gms.internal.ads.zzfty r0 = new com.google.android.gms.internal.ads.zzfty
            r0.<init>()
            com.google.android.gms.internal.ads.zzftz r1 = new com.google.android.gms.internal.ads.zzftz
            r1.<init>()
            r2 = 0
            r3.<init>(r0, r1, r2)
            return
    }

    zzfui(com.google.android.gms.internal.ads.zzfyp<java.lang.Integer> r1, com.google.android.gms.internal.ads.zzfyp<java.lang.Integer> r2, com.google.android.gms.internal.ads.zzfuh r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    static /* synthetic */ java.lang.Integer zzf() {
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    static /* synthetic */ java.lang.Integer zzg() {
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    static /* synthetic */ java.lang.Integer zzh(int r0) {
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    static /* synthetic */ java.lang.Integer zzi(int r0) {
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    static /* synthetic */ java.lang.Integer zzj(int r0) {
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    static /* synthetic */ java.lang.Integer zzk(int r0) {
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    static /* synthetic */ java.lang.Integer zzl(int r0) {
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    static /* synthetic */ java.net.URLConnection zzp(java.net.URL r0) throws java.io.IOException {
            java.net.URLConnection r0 = r0.openConnection()
            return r0
    }

    static /* synthetic */ java.net.URLConnection zzq(android.net.Network r0, java.net.URL r1) throws java.io.IOException {
            java.net.URLConnection r0 = r0.openConnection(r1)
            return r0
    }

    public static void zzs(java.net.HttpURLConnection r0) {
            com.google.android.gms.internal.ads.zzftx.zza()
            if (r0 == 0) goto L8
            r0.disconnect()
        L8:
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            java.net.HttpURLConnection r0 = r1.zzd
            zzs(r0)
            return
    }

    public java.net.HttpURLConnection zzm() throws java.io.IOException {
            r2 = this;
            com.google.android.gms.internal.ads.zzfyp<java.lang.Integer> r0 = r2.zza
            java.lang.Object r0 = r0.zza()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            com.google.android.gms.internal.ads.zzfyp<java.lang.Integer> r1 = r2.zzb
            java.lang.Object r1 = r1.zza()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            com.google.android.gms.internal.ads.zzftx.zzb(r0, r1)
            com.google.android.gms.internal.ads.zzfuh r0 = r2.zzc
            java.util.Objects.requireNonNull(r0)
            java.net.URLConnection r0 = r0.zza()
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
            r2.zzd = r0
            return r0
    }

    public java.net.HttpURLConnection zzn(com.google.android.gms.internal.ads.zzfuh r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.ads.zzfua r0 = new com.google.android.gms.internal.ads.zzfua
            r0.<init>(r3)
            r1.zza = r0
            com.google.android.gms.internal.ads.zzfub r3 = new com.google.android.gms.internal.ads.zzfub
            r3.<init>(r4)
            r1.zzb = r3
            r1.zzc = r2
            java.net.HttpURLConnection r2 = r1.zzm()
            return r2
    }

    public java.net.HttpURLConnection zzo(android.net.Network r2, java.net.URL r3, int r4, int r5) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.ads.zzfuc r0 = new com.google.android.gms.internal.ads.zzfuc
            r0.<init>(r4)
            r1.zza = r0
            com.google.android.gms.internal.ads.zzfud r4 = new com.google.android.gms.internal.ads.zzfud
            r4.<init>(r5)
            r1.zzb = r4
            com.google.android.gms.internal.ads.zzfue r4 = new com.google.android.gms.internal.ads.zzfue
            r4.<init>(r2, r3)
            r1.zzc = r4
            java.net.HttpURLConnection r2 = r1.zzm()
            return r2
    }

    public java.net.URLConnection zzr(java.net.URL r2, int r3) throws java.io.IOException {
            r1 = this;
            com.google.android.gms.internal.ads.zzfuf r0 = new com.google.android.gms.internal.ads.zzfuf
            r0.<init>(r3)
            r1.zza = r0
            com.google.android.gms.internal.ads.zzfug r3 = new com.google.android.gms.internal.ads.zzfug
            r3.<init>(r2)
            r1.zzc = r3
            java.net.HttpURLConnection r2 = r1.zzm()
            return r2
    }
}
