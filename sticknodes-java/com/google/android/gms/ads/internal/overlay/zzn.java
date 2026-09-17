package com.google.android.gms.ads.internal.overlay;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzn {
    public zzn() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final void zza(android.content.Context r3, com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4, boolean r5) {
            int r0 = r4.zzk
            r1 = 4
            if (r0 != r1) goto L39
            com.google.android.gms.ads.internal.overlay.zzr r0 = r4.zzc
            if (r0 != 0) goto L39
            com.google.android.gms.ads.internal.client.zza r5 = r4.zzb
            if (r5 == 0) goto L10
            r5.onAdClicked()
        L10:
            com.google.android.gms.internal.ads.zzdga r5 = r4.zzu
            if (r5 == 0) goto L17
            r5.zzdG()
        L17:
            com.google.android.gms.internal.ads.zzcfo r5 = r4.zzd
            android.app.Activity r5 = r5.zzi()
            com.google.android.gms.ads.internal.overlay.zzc r0 = r4.zza
            if (r0 == 0) goto L28
            boolean r0 = r0.zzj
            if (r0 == 0) goto L28
            if (r5 == 0) goto L28
            r3 = r5
        L28:
            com.google.android.gms.ads.internal.zzu.zzh()
            com.google.android.gms.ads.internal.overlay.zzc r5 = r4.zza
            com.google.android.gms.ads.internal.overlay.zzac r4 = r4.zzi
            if (r5 == 0) goto L34
            com.google.android.gms.ads.internal.overlay.zzaa r0 = r5.zzi
            goto L35
        L34:
            r0 = 0
        L35:
            com.google.android.gms.ads.internal.overlay.zza.zzb(r3, r5, r4, r0)
            return
        L39:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.google.android.gms.ads.AdActivity"
            r0.setClassName(r3, r1)
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r1 = r4.zzm
            boolean r1 = r1.isClientJar
            java.lang.String r2 = "com.google.android.gms.ads.internal.overlay.useClientJar"
            r0.putExtra(r2, r1)
            java.lang.String r1 = "shouldCallOnOverlayOpened"
            r0.putExtra(r1, r5)
            android.os.Bundle r5 = new android.os.Bundle
            r1 = 1
            r5.<init>(r1)
            java.lang.String r1 = "com.google.android.gms.ads.inernal.overlay.AdOverlayInfo"
            r5.putParcelable(r1, r4)
            r0.putExtra(r1, r5)
            boolean r4 = com.google.android.gms.common.util.PlatformVersion.isAtLeastLollipop()
            if (r4 != 0) goto L6a
            r4 = 524288(0x80000, float:7.34684E-40)
            r0.addFlags(r4)
        L6a:
            boolean r4 = r3 instanceof android.app.Activity
            if (r4 != 0) goto L73
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r4)
        L73:
            com.google.android.gms.ads.internal.zzu.zzp()
            com.google.android.gms.ads.internal.util.zzt.zzT(r3, r0)
            return
    }
}
