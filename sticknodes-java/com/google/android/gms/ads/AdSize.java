package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final com.google.android.gms.ads.AdSize BANNER = null;
    public static final com.google.android.gms.ads.AdSize FLUID = null;
    public static final com.google.android.gms.ads.AdSize FULL_BANNER = null;
    public static final int FULL_WIDTH = -1;
    public static final com.google.android.gms.ads.AdSize INVALID = null;
    public static final com.google.android.gms.ads.AdSize LARGE_BANNER = null;
    public static final com.google.android.gms.ads.AdSize LEADERBOARD = null;
    public static final com.google.android.gms.ads.AdSize MEDIUM_RECTANGLE = null;
    public static final com.google.android.gms.ads.AdSize SEARCH = null;

    @java.lang.Deprecated
    public static final com.google.android.gms.ads.AdSize SMART_BANNER = null;
    public static final com.google.android.gms.ads.AdSize WIDE_SKYSCRAPER = null;
    public static final com.google.android.gms.ads.AdSize zza = null;
    private final int zzb;
    private final int zzc;
    private final java.lang.String zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;
    private boolean zzh;
    private int zzi;

    static {
            com.google.android.gms.ads.AdSize r0 = new com.google.android.gms.ads.AdSize
            r1 = 320(0x140, float:4.48E-43)
            r2 = 50
            java.lang.String r3 = "320x50_mb"
            r0.<init>(r1, r2, r3)
            com.google.android.gms.ads.AdSize.BANNER = r0
            com.google.android.gms.ads.AdSize r0 = new com.google.android.gms.ads.AdSize
            r3 = 468(0x1d4, float:6.56E-43)
            r4 = 60
            java.lang.String r5 = "468x60_as"
            r0.<init>(r3, r4, r5)
            com.google.android.gms.ads.AdSize.FULL_BANNER = r0
            com.google.android.gms.ads.AdSize r0 = new com.google.android.gms.ads.AdSize
            r3 = 100
            java.lang.String r4 = "320x100_as"
            r0.<init>(r1, r3, r4)
            com.google.android.gms.ads.AdSize.LARGE_BANNER = r0
            com.google.android.gms.ads.AdSize r0 = new com.google.android.gms.ads.AdSize
            r1 = 728(0x2d8, float:1.02E-42)
            r3 = 90
            java.lang.String r4 = "728x90_as"
            r0.<init>(r1, r3, r4)
            com.google.android.gms.ads.AdSize.LEADERBOARD = r0
            com.google.android.gms.ads.AdSize r0 = new com.google.android.gms.ads.AdSize
            r1 = 300(0x12c, float:4.2E-43)
            r3 = 250(0xfa, float:3.5E-43)
            java.lang.String r4 = "300x250_as"
            r0.<init>(r1, r3, r4)
            com.google.android.gms.ads.AdSize.MEDIUM_RECTANGLE = r0
            com.google.android.gms.ads.AdSize r0 = new com.google.android.gms.ads.AdSize
            r1 = 160(0xa0, float:2.24E-43)
            r3 = 600(0x258, float:8.41E-43)
            java.lang.String r4 = "160x600_as"
            r0.<init>(r1, r3, r4)
            com.google.android.gms.ads.AdSize.WIDE_SKYSCRAPER = r0
            com.google.android.gms.ads.AdSize r0 = new com.google.android.gms.ads.AdSize
            r1 = -1
            r3 = -2
            java.lang.String r4 = "smart_banner"
            r0.<init>(r1, r3, r4)
            com.google.android.gms.ads.AdSize.SMART_BANNER = r0
            com.google.android.gms.ads.AdSize r0 = new com.google.android.gms.ads.AdSize
            r1 = -3
            r3 = -4
            java.lang.String r4 = "fluid"
            r0.<init>(r1, r3, r4)
            com.google.android.gms.ads.AdSize.FLUID = r0
            com.google.android.gms.ads.AdSize r0 = new com.google.android.gms.ads.AdSize
            r3 = 0
            java.lang.String r4 = "invalid"
            r0.<init>(r3, r3, r4)
            com.google.android.gms.ads.AdSize.INVALID = r0
            com.google.android.gms.ads.AdSize r0 = new com.google.android.gms.ads.AdSize
            java.lang.String r4 = "50x50_mb"
            r0.<init>(r2, r2, r4)
            com.google.android.gms.ads.AdSize.zza = r0
            com.google.android.gms.ads.AdSize r0 = new com.google.android.gms.ads.AdSize
            java.lang.String r2 = "search_v2"
            r0.<init>(r1, r3, r2)
            com.google.android.gms.ads.AdSize.SEARCH = r0
            return
    }

    public AdSize(int r4, int r5) {
            r3 = this;
            r0 = -1
            if (r4 != r0) goto L6
            java.lang.String r0 = "FULL"
            goto La
        L6:
            java.lang.String r0 = java.lang.String.valueOf(r4)
        La:
            r1 = -2
            if (r5 != r1) goto L10
            java.lang.String r1 = "AUTO"
            goto L14
        L10:
            java.lang.String r1 = java.lang.String.valueOf(r5)
        L14:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "x"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "_as"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r3.<init>(r4, r5, r0)
            return
    }

    AdSize(int r2, int r3, java.lang.String r4) {
            r1 = this;
            r1.<init>()
            if (r2 >= 0) goto L23
            r0 = -1
            if (r2 == r0) goto L23
            r0 = -3
            if (r2 != r0) goto Lc
            goto L23
        Lc:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Invalid width for AdSize: "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
        L23:
            if (r3 >= 0) goto L43
            r0 = -2
            if (r3 == r0) goto L43
            r0 = -4
            if (r3 != r0) goto L2c
            goto L43
        L2c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Invalid height for AdSize: "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
        L43:
            r1.zzb = r2
            r1.zzc = r3
            r1.zzd = r4
            return
    }

    public static com.google.android.gms.ads.AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(android.content.Context r2, int r3) {
            r0 = 50
            r1 = 0
            com.google.android.gms.ads.AdSize r2 = com.google.android.gms.ads.internal.util.client.zzf.zzd(r2, r3, r0, r1)
            r3 = 1
            r2.zze = r3
            return r2
    }

    public static com.google.android.gms.ads.AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(android.content.Context r2, int r3) {
            r0 = 0
            int r2 = com.google.android.gms.ads.internal.util.client.zzf.zza(r2, r0)
            r1 = -1
            if (r2 != r1) goto Lb
            com.google.android.gms.ads.AdSize r2 = com.google.android.gms.ads.AdSize.INVALID
            return r2
        Lb:
            com.google.android.gms.ads.AdSize r1 = new com.google.android.gms.ads.AdSize
            r1.<init>(r3, r0)
            r1.zzg = r2
            r2 = 1
            r1.zzf = r2
            return r1
    }

    public static com.google.android.gms.ads.AdSize getCurrentOrientationInterscrollerAdSize(android.content.Context r1, int r2) {
            r0 = 0
            int r1 = com.google.android.gms.ads.internal.util.client.zzf.zza(r1, r0)
            com.google.android.gms.ads.AdSize r1 = zzj(r2, r1)
            return r1
    }

    public static com.google.android.gms.ads.AdSize getInlineAdaptiveBannerAdSize(int r2, int r3) {
            com.google.android.gms.ads.AdSize r0 = new com.google.android.gms.ads.AdSize
            r1 = 0
            r0.<init>(r2, r1)
            r0.zzg = r3
            r2 = 1
            r0.zzf = r2
            r2 = 32
            if (r3 >= r2) goto L28
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "The maximum height set for the inline adaptive ad size was "
            r2.append(r1)
            r2.append(r3)
            java.lang.String r3 = " dp, which is below the minimum recommended value of 32 dp."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r2)
        L28:
            return r0
    }

    public static com.google.android.gms.ads.AdSize getLandscapeAnchoredAdaptiveBannerAdSize(android.content.Context r2, int r3) {
            r0 = 50
            r1 = 2
            com.google.android.gms.ads.AdSize r2 = com.google.android.gms.ads.internal.util.client.zzf.zzd(r2, r3, r0, r1)
            r3 = 1
            r2.zze = r3
            return r2
    }

    public static com.google.android.gms.ads.AdSize getLandscapeInlineAdaptiveBannerAdSize(android.content.Context r2, int r3) {
            r0 = 2
            int r2 = com.google.android.gms.ads.internal.util.client.zzf.zza(r2, r0)
            com.google.android.gms.ads.AdSize r0 = new com.google.android.gms.ads.AdSize
            r1 = 0
            r0.<init>(r3, r1)
            r3 = -1
            if (r2 != r3) goto L11
            com.google.android.gms.ads.AdSize r2 = com.google.android.gms.ads.AdSize.INVALID
            return r2
        L11:
            r0.zzg = r2
            r2 = 1
            r0.zzf = r2
            return r0
    }

    public static com.google.android.gms.ads.AdSize getLandscapeInterscrollerAdSize(android.content.Context r1, int r2) {
            r0 = 2
            int r1 = com.google.android.gms.ads.internal.util.client.zzf.zza(r1, r0)
            com.google.android.gms.ads.AdSize r1 = zzj(r2, r1)
            return r1
    }

    public static com.google.android.gms.ads.AdSize getPortraitAnchoredAdaptiveBannerAdSize(android.content.Context r2, int r3) {
            r0 = 50
            r1 = 1
            com.google.android.gms.ads.AdSize r2 = com.google.android.gms.ads.internal.util.client.zzf.zzd(r2, r3, r0, r1)
            r2.zze = r1
            return r2
    }

    public static com.google.android.gms.ads.AdSize getPortraitInlineAdaptiveBannerAdSize(android.content.Context r3, int r4) {
            r0 = 1
            int r3 = com.google.android.gms.ads.internal.util.client.zzf.zza(r3, r0)
            com.google.android.gms.ads.AdSize r1 = new com.google.android.gms.ads.AdSize
            r2 = 0
            r1.<init>(r4, r2)
            r4 = -1
            if (r3 != r4) goto L11
            com.google.android.gms.ads.AdSize r3 = com.google.android.gms.ads.AdSize.INVALID
            return r3
        L11:
            r1.zzg = r3
            r1.zzf = r0
            return r1
    }

    public static com.google.android.gms.ads.AdSize getPortraitInterscrollerAdSize(android.content.Context r1, int r2) {
            r0 = 1
            int r1 = com.google.android.gms.ads.internal.util.client.zzf.zza(r1, r0)
            com.google.android.gms.ads.AdSize r1 = zzj(r2, r1)
            return r1
    }

    private static com.google.android.gms.ads.AdSize zzj(int r2, int r3) {
            r0 = -1
            if (r3 != r0) goto L6
            com.google.android.gms.ads.AdSize r2 = com.google.android.gms.ads.AdSize.INVALID
            return r2
        L6:
            com.google.android.gms.ads.AdSize r0 = new com.google.android.gms.ads.AdSize
            r1 = 0
            r0.<init>(r2, r1)
            r0.zzi = r3
            r2 = 1
            r0.zzh = r2
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r5 != r4) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof com.google.android.gms.ads.AdSize
            if (r2 != 0) goto Ld
            return r0
        Ld:
            com.google.android.gms.ads.AdSize r5 = (com.google.android.gms.ads.AdSize) r5
            int r2 = r4.zzb
            int r3 = r5.zzb
            if (r2 != r3) goto L26
            int r2 = r4.zzc
            int r3 = r5.zzc
            if (r2 != r3) goto L26
            java.lang.String r2 = r4.zzd
            java.lang.String r5 = r5.zzd
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L26
            return r1
        L26:
            return r0
    }

    public int getHeight() {
            r1 = this;
            int r0 = r1.zzc
            return r0
    }

    public int getHeightInPixels(android.content.Context r3) {
            r2 = this;
            int r0 = r2.zzc
            r1 = -4
            if (r0 == r1) goto L20
            r1 = -3
            if (r0 == r1) goto L20
            r1 = -2
            if (r0 == r1) goto L13
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            int r3 = com.google.android.gms.ads.internal.util.client.zzf.zzy(r3, r0)
            return r3
        L13:
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r3 = com.google.android.gms.ads.internal.client.zzs.zza(r3)
            return r3
        L20:
            r3 = -1
            return r3
    }

    public int getWidth() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    public int getWidthInPixels(android.content.Context r4) {
            r3 = this;
            int r0 = r3.zzb
            r1 = -3
            r2 = -1
            if (r0 == r1) goto L1d
            if (r0 == r2) goto L10
            com.google.android.gms.ads.internal.client.zzbc.zzb()
            int r4 = com.google.android.gms.ads.internal.util.client.zzf.zzy(r4, r0)
            return r4
        L10:
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.zzs> r0 = com.google.android.gms.ads.internal.client.zzs.CREATOR
            int r4 = r4.widthPixels
            return r4
        L1d:
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.zzd
            int r0 = r0.hashCode()
            return r0
    }

    public boolean isAutoHeight() {
            r2 = this;
            int r0 = r2.zzc
            r1 = -2
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public boolean isFluid() {
            r2 = this;
            int r0 = r2.zzb
            r1 = -3
            if (r0 != r1) goto Lc
            int r0 = r2.zzc
            r1 = -4
            if (r0 != r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public boolean isFullWidth() {
            r2 = this;
            int r0 = r2.zzb
            r1 = -1
            if (r0 != r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.zzd
            return r0
    }

    final int zza() {
            r1 = this;
            int r0 = r1.zzi
            return r0
    }

    final int zzb() {
            r1 = this;
            int r0 = r1.zzg
            return r0
    }

    final void zzc(int r1) {
            r0 = this;
            r0.zzg = r1
            return
    }

    final void zzd(int r1) {
            r0 = this;
            r0.zzi = r1
            return
    }

    final void zze(boolean r1) {
            r0 = this;
            r1 = 1
            r0.zzf = r1
            return
    }

    final void zzf(boolean r1) {
            r0 = this;
            r1 = 1
            r0.zzh = r1
            return
    }

    final boolean zzg() {
            r1 = this;
            boolean r0 = r1.zze
            return r0
    }

    final boolean zzh() {
            r1 = this;
            boolean r0 = r1.zzf
            return r0
    }

    final boolean zzi() {
            r1 = this;
            boolean r0 = r1.zzh
            return r0
    }
}
