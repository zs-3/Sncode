package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzepx implements com.google.android.gms.internal.ads.zzexg {
    public final com.google.android.gms.ads.internal.client.zzs zza;
    public final java.lang.String zzb;
    public final boolean zzc;
    public final java.lang.String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final java.lang.String zzh;
    public final boolean zzi;

    public zzepx(com.google.android.gms.ads.internal.client.zzs r2, java.lang.String r3, boolean r4, java.lang.String r5, float r6, int r7, int r8, java.lang.String r9, boolean r10) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "the adSize must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            r1.zza = r2
            r1.zzb = r3
            r1.zzc = r4
            r1.zzd = r5
            r1.zze = r6
            r1.zzf = r7
            r1.zzg = r8
            r1.zzh = r9
            r1.zzi = r10
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexg
    public final /* bridge */ /* synthetic */ void zzj(java.lang.Object r10) {
            r9 = this;
            com.google.android.gms.ads.internal.client.zzs r0 = r9.zza
            android.os.Bundle r10 = (android.os.Bundle) r10
            int r0 = r0.zze
            r1 = 0
            r2 = 1
            r3 = -1
            if (r0 != r3) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            java.lang.String r3 = "smart_w"
            java.lang.String r4 = "full"
            com.google.android.gms.internal.ads.zzfhq.zzf(r10, r3, r4, r0)
            com.google.android.gms.ads.internal.client.zzs r0 = r9.zza
            int r0 = r0.zzb
            r3 = -2
            if (r0 != r3) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            java.lang.String r3 = "smart_h"
            java.lang.String r4 = "auto"
            com.google.android.gms.internal.ads.zzfhq.zzf(r10, r3, r4, r0)
            com.google.android.gms.ads.internal.client.zzs r0 = r9.zza
            boolean r0 = r0.zzj
            java.lang.String r3 = "ene"
            com.google.android.gms.internal.ads.zzfhq.zzg(r10, r3, r2, r0)
            com.google.android.gms.ads.internal.client.zzs r0 = r9.zza
            boolean r0 = r0.zzm
            java.lang.String r3 = "rafmt"
            java.lang.String r4 = "102"
            com.google.android.gms.internal.ads.zzfhq.zzf(r10, r3, r4, r0)
            com.google.android.gms.ads.internal.client.zzs r0 = r9.zza
            boolean r0 = r0.zzn
            java.lang.String r4 = "103"
            com.google.android.gms.internal.ads.zzfhq.zzf(r10, r3, r4, r0)
            com.google.android.gms.ads.internal.client.zzs r0 = r9.zza
            boolean r0 = r0.zzo
            java.lang.String r4 = "105"
            com.google.android.gms.internal.ads.zzfhq.zzf(r10, r3, r4, r0)
            boolean r0 = r9.zzi
            java.lang.String r3 = "inline_adaptive_slot"
            com.google.android.gms.internal.ads.zzfhq.zzg(r10, r3, r2, r0)
            com.google.android.gms.ads.internal.client.zzs r0 = r9.zza
            boolean r0 = r0.zzo
            java.lang.String r3 = "interscroller_slot"
            com.google.android.gms.internal.ads.zzfhq.zzg(r10, r3, r2, r0)
            java.lang.String r0 = r9.zzb
            java.lang.String r3 = "format"
            com.google.android.gms.internal.ads.zzfhq.zzc(r10, r3, r0)
            boolean r0 = r9.zzc
            java.lang.String r3 = "fluid"
            java.lang.String r4 = "height"
            com.google.android.gms.internal.ads.zzfhq.zzf(r10, r3, r4, r0)
            java.lang.String r0 = r9.zzd
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ r2
            java.lang.String r3 = r9.zzd
            java.lang.String r5 = "sz"
            com.google.android.gms.internal.ads.zzfhq.zzf(r10, r5, r3, r0)
            float r0 = r9.zze
            java.lang.String r3 = "u_sd"
            r10.putFloat(r3, r0)
            int r0 = r9.zzf
            java.lang.String r3 = "sw"
            r10.putInt(r3, r0)
            int r0 = r9.zzg
            java.lang.String r3 = "sh"
            r10.putInt(r3, r0)
            java.lang.String r0 = r9.zzh
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ r2
            java.lang.String r2 = r9.zzh
            java.lang.String r3 = "sc"
            com.google.android.gms.internal.ads.zzfhq.zzf(r10, r3, r2, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.ads.internal.client.zzs r2 = r9.zza
            com.google.android.gms.ads.internal.client.zzs[] r2 = r2.zzg
            java.lang.String r3 = "is_fluid_height"
            java.lang.String r5 = "width"
            if (r2 != 0) goto Lca
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            com.google.android.gms.ads.internal.client.zzs r2 = r9.zza
            int r2 = r2.zzb
            r1.putInt(r4, r2)
            com.google.android.gms.ads.internal.client.zzs r2 = r9.zza
            int r2 = r2.zze
            r1.putInt(r5, r2)
            com.google.android.gms.ads.internal.client.zzs r2 = r9.zza
            boolean r2 = r2.zzi
            r1.putBoolean(r3, r2)
            r0.add(r1)
            goto Le9
        Lca:
            int r6 = r2.length
            if (r1 >= r6) goto Le9
            r6 = r2[r1]
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            boolean r8 = r6.zzi
            r7.putBoolean(r3, r8)
            int r8 = r6.zzb
            r7.putInt(r4, r8)
            int r6 = r6.zze
            r7.putInt(r5, r6)
            r0.add(r7)
            int r1 = r1 + 1
            goto Lca
        Le9:
            java.lang.String r1 = "valid_ad_sizes"
            r10.putParcelableArrayList(r1, r0)
            return
    }
}
