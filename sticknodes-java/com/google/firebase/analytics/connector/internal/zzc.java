package com.google.firebase.analytics.connector.internal;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzc {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.common.collect.ImmutableSet zzb = null;
    private static final com.google.common.collect.ImmutableList zzc = null;
    private static final com.google.common.collect.ImmutableList zzd = null;
    private static final com.google.common.collect.ImmutableList zze = null;
    private static final com.google.common.collect.ImmutableList zzf = null;
    private static final com.google.common.collect.ImmutableList zzg = null;

    static {
            java.lang.String r0 = "_ac"
            java.lang.String r1 = "campaign_details"
            java.lang.String r2 = "_ug"
            java.lang.String r3 = "_iapx"
            java.lang.String r4 = "_exp_set"
            java.lang.String r5 = "_exp_clear"
            java.lang.String r6 = "_exp_activate"
            java.lang.String r7 = "_exp_timeout"
            java.lang.String r8 = "_exp_expire"
            java.lang.String[] r15 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
            java.lang.String r9 = "_in"
            java.lang.String r10 = "_xa"
            java.lang.String r11 = "_xu"
            java.lang.String r12 = "_aq"
            java.lang.String r13 = "_aa"
            java.lang.String r14 = "_ai"
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.of(r9, r10, r11, r12, r13, r14, r15)
            com.google.firebase.analytics.connector.internal.zzc.zzb = r0
            java.lang.String r1 = "_e"
            java.lang.String r2 = "_f"
            java.lang.String r3 = "_iap"
            java.lang.String r4 = "_s"
            java.lang.String r5 = "_au"
            java.lang.String r6 = "_ui"
            java.lang.String r7 = "_cd"
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of(r1, r2, r3, r4, r5, r6, r7)
            com.google.firebase.analytics.connector.internal.zzc.zzc = r0
            java.lang.String r0 = "auto"
            java.lang.String r1 = "app"
            java.lang.String r2 = "am"
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of(r0, r1, r2)
            com.google.firebase.analytics.connector.internal.zzc.zzd = r0
            java.lang.String r0 = "_r"
            java.lang.String r1 = "_dbg"
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of(r0, r1)
            com.google.firebase.analytics.connector.internal.zzc.zze = r0
            com.google.common.collect.ImmutableList$Builder r0 = new com.google.common.collect.ImmutableList$Builder
            r0.<init>()
            java.lang.String[] r1 = com.google.android.gms.measurement.internal.zzka.zza
            com.google.common.collect.ImmutableList$Builder r0 = r0.add(r1)
            java.lang.String[] r1 = com.google.android.gms.measurement.internal.zzka.zzb
            com.google.common.collect.ImmutableList$Builder r0 = r0.add(r1)
            com.google.common.collect.ImmutableList r0 = r0.build()
            com.google.firebase.analytics.connector.internal.zzc.zzf = r0
            java.lang.String r0 = "^_ltv_[A-Z]{3}$"
            java.lang.String r1 = "^_cc[1-5]{1}$"
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of(r0, r1)
            com.google.firebase.analytics.connector.internal.zzc.zzg = r0
            return
    }

    public static boolean zza(java.lang.String r5, java.lang.String r6, android.os.Bundle r7) {
            java.lang.String r0 = "_cmp"
            boolean r6 = r0.equals(r6)
            r0 = 1
            if (r6 != 0) goto La
            return r0
        La:
            boolean r6 = zzd(r5)
            r1 = 0
            if (r6 != 0) goto L12
            return r1
        L12:
            if (r7 != 0) goto L15
            return r1
        L15:
            com.google.common.collect.ImmutableList r6 = com.google.firebase.analytics.connector.internal.zzc.zze
            int r2 = r6.size()
            r3 = 0
        L1c:
            if (r3 >= r2) goto L2d
            java.lang.Object r4 = r6.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r7.containsKey(r4)
            int r3 = r3 + 1
            if (r4 == 0) goto L1c
            return r1
        L2d:
            int r6 = r5.hashCode()
            r2 = 101200(0x18b50, float:1.41811E-40)
            r3 = 2
            if (r6 == r2) goto L56
            r2 = 101230(0x18b6e, float:1.41853E-40)
            if (r6 == r2) goto L4c
            r2 = 3142703(0x2ff42f, float:4.403865E-39)
            if (r6 == r2) goto L42
            goto L60
        L42:
            java.lang.String r6 = "fiam"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L60
            r5 = 2
            goto L61
        L4c:
            java.lang.String r6 = "fdl"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L60
            r5 = 1
            goto L61
        L56:
            java.lang.String r6 = "fcm"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L60
            r5 = 0
            goto L61
        L60:
            r5 = -1
        L61:
            java.lang.String r6 = "_cis"
            if (r5 == 0) goto L76
            if (r5 == r0) goto L70
            if (r5 == r3) goto L6a
            return r1
        L6a:
            java.lang.String r5 = "fiam_integration"
            r7.putString(r6, r5)
            return r0
        L70:
            java.lang.String r5 = "fdl_integration"
            r7.putString(r6, r5)
            return r0
        L76:
            java.lang.String r5 = "fcm_integration"
            r7.putString(r6, r5)
            return r0
    }

    public static boolean zzb(java.lang.String r4, android.os.Bundle r5) {
            com.google.common.collect.ImmutableList r0 = com.google.firebase.analytics.connector.internal.zzc.zzc
            boolean r4 = r0.contains(r4)
            r0 = 0
            if (r4 == 0) goto La
            return r0
        La:
            if (r5 == 0) goto L24
            com.google.common.collect.ImmutableList r4 = com.google.firebase.analytics.connector.internal.zzc.zze
            int r1 = r4.size()
            r2 = 0
        L13:
            if (r2 >= r1) goto L24
            java.lang.Object r3 = r4.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r5.containsKey(r3)
            int r2 = r2 + 1
            if (r3 == 0) goto L13
            return r0
        L24:
            r4 = 1
            return r4
    }

    public static boolean zzc(java.lang.String r1) {
            com.google.common.collect.ImmutableSet r0 = com.google.firebase.analytics.connector.internal.zzc.zzb
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public static boolean zzd(java.lang.String r1) {
            com.google.common.collect.ImmutableList r0 = com.google.firebase.analytics.connector.internal.zzc.zzd
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }
}
