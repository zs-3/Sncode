package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public class zzarh extends com.google.android.gms.internal.ads.zzaqc {
    private final java.lang.Object zza;
    private final com.google.android.gms.internal.ads.zzaqh zzb;

    public zzarh(int r1, java.lang.String r2, com.google.android.gms.internal.ads.zzaqh r3, com.google.android.gms.internal.ads.zzaqg r4) {
            r0 = this;
            r0.<init>(r1, r2, r4)
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.zza = r1
            r0.zzb = r3
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    protected final com.google.android.gms.internal.ads.zzaqi zzh(com.google.android.gms.internal.ads.zzapy r11) {
            r10 = this;
            java.lang.String r0 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L45
            byte[] r1 = r11.zzb     // Catch: java.io.UnsupportedEncodingException -> L45
            java.util.Map r2 = r11.zzc     // Catch: java.io.UnsupportedEncodingException -> L45
            java.lang.String r3 = "ISO-8859-1"
            if (r2 != 0) goto Lb
            goto L41
        Lb:
            java.lang.String r4 = "Content-Type"
            java.lang.Object r2 = r2.get(r4)     // Catch: java.io.UnsupportedEncodingException -> L45
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.io.UnsupportedEncodingException -> L45
            if (r2 == 0) goto L41
            java.lang.String r4 = ";"
            r5 = 0
            java.lang.String[] r2 = r2.split(r4, r5)     // Catch: java.io.UnsupportedEncodingException -> L45
            r4 = 1
            r6 = 1
        L1e:
            int r7 = r2.length     // Catch: java.io.UnsupportedEncodingException -> L45
            if (r6 >= r7) goto L41
            r7 = r2[r6]     // Catch: java.io.UnsupportedEncodingException -> L45
            java.lang.String r7 = r7.trim()     // Catch: java.io.UnsupportedEncodingException -> L45
            java.lang.String r8 = "="
            java.lang.String[] r7 = r7.split(r8, r5)     // Catch: java.io.UnsupportedEncodingException -> L45
            int r8 = r7.length     // Catch: java.io.UnsupportedEncodingException -> L45
            r9 = 2
            if (r8 != r9) goto L3e
            r8 = r7[r5]     // Catch: java.io.UnsupportedEncodingException -> L45
            java.lang.String r9 = "charset"
            boolean r8 = r8.equals(r9)     // Catch: java.io.UnsupportedEncodingException -> L45
            if (r8 == 0) goto L3e
            r3 = r7[r4]     // Catch: java.io.UnsupportedEncodingException -> L45
            goto L41
        L3e:
            int r6 = r6 + 1
            goto L1e
        L41:
            r0.<init>(r1, r3)     // Catch: java.io.UnsupportedEncodingException -> L45
            goto L4c
        L45:
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r11.zzb
            r0.<init>(r1)
        L4c:
            com.google.android.gms.internal.ads.zzapl r11 = com.google.android.gms.internal.ads.zzaqz.zzb(r11)
            com.google.android.gms.internal.ads.zzaqi r11 = com.google.android.gms.internal.ads.zzaqi.zzb(r0, r11)
            return r11
    }

    @Override // com.google.android.gms.internal.ads.zzaqc
    protected /* bridge */ /* synthetic */ void zzo(java.lang.Object r1) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            r0.zzz(r1)
            return
    }

    protected void zzz(java.lang.String r3) {
            r2 = this;
            java.lang.Object r0 = r2.zza
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzaqh r1 = r2.zzb     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            r1.zza(r3)
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }
}
