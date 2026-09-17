package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfok {
    private final com.google.android.gms.internal.ads.zzfov zza;
    private final android.webkit.WebView zzb;
    private final java.util.List zzc;
    private final java.util.Map zzd;
    private final java.lang.String zze;
    private final java.lang.String zzf;
    private final com.google.android.gms.internal.ads.zzfol zzg;

    private zzfok(com.google.android.gms.internal.ads.zzfov r1, android.webkit.WebView r2, java.lang.String r3, java.util.List r4, java.lang.String r5, java.lang.String r6, com.google.android.gms.internal.ads.zzfol r7) {
            r0 = this;
            r0.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.zzc = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r0.zzd = r3
            r0.zza = r1
            r0.zzb = r2
            r0.zzg = r7
            r0.zzf = r5
            r0.zze = r6
            return
    }

    public static com.google.android.gms.internal.ads.zzfok zzb(com.google.android.gms.internal.ads.zzfov r10, android.webkit.WebView r11, java.lang.String r12, java.lang.String r13) {
            if (r13 == 0) goto L9
            r0 = 256(0x100, float:3.59E-43)
            java.lang.String r1 = "CustomReferenceData is greater than 256 characters"
            com.google.android.gms.internal.ads.zzfqb.zzd(r13, r0, r1)
        L9:
            com.google.android.gms.internal.ads.zzfok r0 = new com.google.android.gms.internal.ads.zzfok
            r5 = 0
            r6 = 0
            com.google.android.gms.internal.ads.zzfol r9 = com.google.android.gms.internal.ads.zzfol.zza
            r2 = r0
            r3 = r10
            r4 = r11
            r7 = r12
            r8 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r0
    }

    public static com.google.android.gms.internal.ads.zzfok zzc(com.google.android.gms.internal.ads.zzfov r8, android.webkit.WebView r9, java.lang.String r10, java.lang.String r11) {
            java.lang.String r6 = ""
            r11 = 256(0x100, float:3.59E-43)
            java.lang.String r0 = "CustomReferenceData is greater than 256 characters"
            com.google.android.gms.internal.ads.zzfqb.zzd(r6, r11, r0)
            com.google.android.gms.internal.ads.zzfok r11 = new com.google.android.gms.internal.ads.zzfok
            com.google.android.gms.internal.ads.zzfol r7 = com.google.android.gms.internal.ads.zzfol.zzc
            r3 = 0
            r4 = 0
            r0 = r11
            r1 = r8
            r2 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r11
    }

    public final android.webkit.WebView zza() {
            r1 = this;
            android.webkit.WebView r0 = r1.zzb
            return r0
    }

    public final com.google.android.gms.internal.ads.zzfol zzd() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfol r0 = r1.zzg
            return r0
    }

    public final com.google.android.gms.internal.ads.zzfov zze() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfov r0 = r1.zza
            return r0
    }

    public final java.lang.String zzf() {
            r1 = this;
            java.lang.String r0 = r1.zzf
            return r0
    }

    public final java.lang.String zzg() {
            r1 = this;
            java.lang.String r0 = r1.zze
            return r0
    }

    public final java.util.List zzh() {
            r1 = this;
            java.util.List r0 = r1.zzc
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    public final java.util.Map zzi() {
            r1 = this;
            java.util.Map r0 = r1.zzd
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            return r0
    }
}
