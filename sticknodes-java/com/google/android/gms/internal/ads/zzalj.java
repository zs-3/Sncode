package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzalj implements com.google.android.gms.internal.ads.zzakv {
    private final com.google.android.gms.internal.ads.zzek zza;
    private final com.google.android.gms.internal.ads.zzek zzb;
    private final com.google.android.gms.internal.ads.zzali zzc;
    private java.util.zip.Inflater zzd;

    public zzalj() {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            r0.<init>()
            r1.zza = r0
            com.google.android.gms.internal.ads.zzek r0 = new com.google.android.gms.internal.ads.zzek
            r0.<init>()
            r1.zzb = r0
            com.google.android.gms.internal.ads.zzali r0 = new com.google.android.gms.internal.ads.zzali
            r0.<init>()
            r1.zzc = r0
            return
    }

    @Override // com.google.android.gms.internal.ads.zzakv
    public final void zza(byte[] r7, int r8, int r9, com.google.android.gms.internal.ads.zzaku r10, com.google.android.gms.internal.ads.zzdn r11) {
            r6 = this;
            int r9 = r9 + r8
            com.google.android.gms.internal.ads.zzek r10 = r6.zza
            r10.zzJ(r7, r9)
            com.google.android.gms.internal.ads.zzek r7 = r6.zza
            r7.zzL(r8)
            com.google.android.gms.internal.ads.zzek r7 = r6.zza
            int r8 = r7.zzb()
            if (r8 <= 0) goto L3d
            int r8 = r7.zzf()
            r9 = 120(0x78, float:1.68E-43)
            if (r8 != r9) goto L3d
            java.util.zip.Inflater r8 = r6.zzd
            if (r8 != 0) goto L26
            java.util.zip.Inflater r8 = new java.util.zip.Inflater
            r8.<init>()
            r6.zzd = r8
        L26:
            com.google.android.gms.internal.ads.zzek r8 = r6.zzb
            java.util.zip.Inflater r9 = r6.zzd
            boolean r8 = com.google.android.gms.internal.ads.zzeu.zzG(r7, r8, r9)
            if (r8 == 0) goto L3d
            com.google.android.gms.internal.ads.zzek r8 = r6.zzb
            byte[] r9 = r8.zzN()
            int r8 = r8.zze()
            r7.zzJ(r9, r8)
        L3d:
            com.google.android.gms.internal.ads.zzali r7 = r6.zzc
            r7.zze()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L47:
            com.google.android.gms.internal.ads.zzek r7 = r6.zza
            int r8 = r7.zzb()
            r9 = 3
            if (r8 < r9) goto L8f
            com.google.android.gms.internal.ads.zzali r8 = r6.zzc
            int r9 = r7.zze()
            int r10 = r7.zzm()
            int r0 = r7.zzq()
            int r2 = r7.zzd()
            int r2 = r2 + r0
            r3 = 0
            if (r2 <= r9) goto L6a
            r7.zzL(r9)
            goto L89
        L6a:
            r9 = 128(0x80, float:1.794E-43)
            if (r10 == r9) goto L7e
            switch(r10) {
                case 20: goto L7a;
                case 21: goto L76;
                case 22: goto L72;
                default: goto L71;
            }
        L71:
            goto L86
        L72:
            com.google.android.gms.internal.ads.zzali.zzc(r8, r7, r0)
            goto L86
        L76:
            com.google.android.gms.internal.ads.zzali.zzb(r8, r7, r0)
            goto L86
        L7a:
            com.google.android.gms.internal.ads.zzali.zzd(r8, r7, r0)
            goto L86
        L7e:
            com.google.android.gms.internal.ads.zzdb r9 = r8.zza()
            r8.zze()
            r3 = r9
        L86:
            r7.zzL(r2)
        L89:
            if (r3 == 0) goto L47
            r1.add(r3)
            goto L47
        L8f:
            com.google.android.gms.internal.ads.zzakn r7 = new com.google.android.gms.internal.ads.zzakn
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r7
            r2 = r4
            r0.<init>(r1, r2, r4)
            r11.zza(r7)
            return
    }
}
