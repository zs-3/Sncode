package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzr {
    public static final com.google.android.gms.ads.internal.client.zzr zza = null;

    static {
            com.google.android.gms.ads.internal.client.zzr r0 = new com.google.android.gms.ads.internal.client.zzr
            r0.<init>()
            com.google.android.gms.ads.internal.client.zzr.zza = r0
            return
    }

    protected zzr() {
            r0 = this;
            r0.<init>()
            return
    }

    public final com.google.android.gms.ads.internal.client.zzm zza(android.content.Context r32, com.google.android.gms.ads.internal.client.zzei r33) {
            r31 = this;
            r0 = r33
            java.lang.String r14 = r33.zzk()
            java.util.Set r1 = r33.zzp()
            boolean r2 = r1.isEmpty()
            r3 = 0
            if (r2 != 0) goto L1e
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            java.util.List r1 = java.util.Collections.unmodifiableList(r2)
            r7 = r1
            r1 = r32
            goto L21
        L1e:
            r1 = r32
            r7 = r3
        L21:
            boolean r8 = r0.zzs(r1)
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r2 = com.google.ads.mediation.admob.AdMobAdapter.class
            android.os.Bundle r5 = r0.zzf(r2)
            java.lang.String r11 = r33.zzl()
            com.google.android.gms.ads.search.SearchAdRequest r2 = r33.zzi()
            if (r2 == 0) goto L3c
            com.google.android.gms.ads.internal.client.zzfy r4 = new com.google.android.gms.ads.internal.client.zzfy
            r4.<init>(r2)
            r12 = r4
            goto L3d
        L3c:
            r12 = r3
        L3d:
            android.content.Context r1 = r32.getApplicationContext()
            if (r1 == 0) goto L59
            java.lang.String r1 = r1.getPackageName()
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r2 = r2.getStackTrace()
            java.lang.String r1 = com.google.android.gms.ads.internal.util.client.zzf.zzr(r2, r1)
            r19 = r1
            goto L5b
        L59:
            r19 = r3
        L5b:
            boolean r20 = r33.zzr()
            com.google.android.gms.ads.internal.client.zzey r1 = com.google.android.gms.ads.internal.client.zzey.zzf()
            com.google.android.gms.ads.RequestConfiguration r27 = r1.zzc()
            int r1 = r33.zzb()
            int r2 = r27.getTagForChildDirectedTreatment()
            int r9 = java.lang.Math.max(r1, r2)
            r1 = 2
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            r1[r2] = r3
            r2 = 1
            java.lang.String r3 = r27.getMaxAdContentRating()
            r1[r2] = r3
            java.util.List r1 = java.util.Arrays.asList(r1)
            com.google.android.gms.ads.internal.client.zzp r2 = new com.google.android.gms.ads.internal.client.zzp
            r2.<init>()
            java.lang.Object r1 = java.util.Collections.max(r1, r2)
            r23 = r1
            java.lang.String r23 = (java.lang.String) r23
            java.util.List r24 = r33.zzn()
            com.google.android.gms.ads.internal.client.zzm r30 = new com.google.android.gms.ads.internal.client.zzm
            r1 = r30
            r2 = 8
            r3 = -1
            r6 = -1
            r10 = 0
            r13 = 0
            android.os.Bundle r15 = r33.zzg()
            android.os.Bundle r16 = r33.zze()
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.Set r3 = r33.zzo()
            r2.<init>(r3)
            java.util.List r17 = java.util.Collections.unmodifiableList(r2)
            java.lang.String r18 = r33.zzm()
            r21 = 0
            int r22 = r27.getTagForUnderAgeOfConsent()
            int r25 = r33.zza()
            java.lang.String r26 = r33.zzj()
            com.google.android.gms.ads.RequestConfiguration$PublisherPrivacyPersonalizationState r2 = r27.getPublisherPrivacyPersonalizationState()
            int r27 = r2.getValue()
            long r28 = r33.zzc()
            r2 = 8
            r3 = -1
            r1.<init>(r2, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return r30
    }
}
