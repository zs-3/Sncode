package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfoj {
    private final com.google.android.gms.internal.ads.zzfou zza;
    private final com.google.android.gms.internal.ads.zzfou zzb;
    private final boolean zzc;
    private final com.google.android.gms.internal.ads.zzfon zzd;
    private final com.google.android.gms.internal.ads.zzfoq zze;

    private zzfoj(com.google.android.gms.internal.ads.zzfon r1, com.google.android.gms.internal.ads.zzfoq r2, com.google.android.gms.internal.ads.zzfou r3, com.google.android.gms.internal.ads.zzfou r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.zzd = r1
            r0.zze = r2
            r0.zza = r3
            if (r4 != 0) goto L10
            com.google.android.gms.internal.ads.zzfou r1 = com.google.android.gms.internal.ads.zzfou.zzc
            r0.zzb = r1
            goto L12
        L10:
            r0.zzb = r4
        L12:
            r0.zzc = r5
            return
    }

    public static com.google.android.gms.internal.ads.zzfoj zza(com.google.android.gms.internal.ads.zzfon r8, com.google.android.gms.internal.ads.zzfoq r9, com.google.android.gms.internal.ads.zzfou r10, com.google.android.gms.internal.ads.zzfou r11, boolean r12) {
            java.lang.String r0 = "CreativeType is null"
            com.google.android.gms.internal.ads.zzfqb.zzc(r8, r0)
            java.lang.String r0 = "ImpressionType is null"
            com.google.android.gms.internal.ads.zzfqb.zzc(r9, r0)
            java.lang.String r0 = "Impression owner is null"
            com.google.android.gms.internal.ads.zzfqb.zzc(r10, r0)
            com.google.android.gms.internal.ads.zzfou r0 = com.google.android.gms.internal.ads.zzfou.zzc
            if (r10 == r0) goto L3f
            com.google.android.gms.internal.ads.zzfon r0 = com.google.android.gms.internal.ads.zzfon.zza
            java.lang.String r1 = "ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript"
            if (r8 != r0) goto L24
            com.google.android.gms.internal.ads.zzfou r0 = com.google.android.gms.internal.ads.zzfou.zza
            if (r10 == r0) goto L1e
            goto L24
        L1e:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            throw r8
        L24:
            com.google.android.gms.internal.ads.zzfoq r0 = com.google.android.gms.internal.ads.zzfoq.zza
            if (r9 != r0) goto L33
            com.google.android.gms.internal.ads.zzfou r0 = com.google.android.gms.internal.ads.zzfou.zza
            if (r10 == r0) goto L2d
            goto L33
        L2d:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            throw r8
        L33:
            com.google.android.gms.internal.ads.zzfoj r0 = new com.google.android.gms.internal.ads.zzfoj
            r2 = r0
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L3f:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Impression owner is none"
            r8.<init>(r9)
            throw r8
    }

    public final org.json.JSONObject zzb() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            com.google.android.gms.internal.ads.zzfou r1 = r3.zza
            java.lang.String r2 = "impressionOwner"
            com.google.android.gms.internal.ads.zzfpx.zze(r0, r2, r1)
            com.google.android.gms.internal.ads.zzfou r1 = r3.zzb
            java.lang.String r2 = "mediaEventsOwner"
            com.google.android.gms.internal.ads.zzfpx.zze(r0, r2, r1)
            com.google.android.gms.internal.ads.zzfon r1 = r3.zzd
            java.lang.String r2 = "creativeType"
            com.google.android.gms.internal.ads.zzfpx.zze(r0, r2, r1)
            com.google.android.gms.internal.ads.zzfoq r1 = r3.zze
            java.lang.String r2 = "impressionType"
            com.google.android.gms.internal.ads.zzfpx.zze(r0, r2, r1)
            boolean r1 = r3.zzc
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "isolateVerificationScripts"
            com.google.android.gms.internal.ads.zzfpx.zze(r0, r2, r1)
            return r0
    }
}
