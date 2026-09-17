package com.google.android.gms.ads.search;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class DynamicHeightSearchAdRequest {
    private final com.google.android.gms.ads.search.SearchAdRequest zza;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    public static final class Builder {
        private final com.google.android.gms.ads.search.zzb zza;
        private final android.os.Bundle zzb;

        public Builder() {
                r1 = this;
                r1.<init>()
                com.google.android.gms.ads.search.zzb r0 = new com.google.android.gms.ads.search.zzb
                r0.<init>()
                r1.zza = r0
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                r1.zzb = r0
                return
        }

        static /* bridge */ /* synthetic */ com.google.android.gms.ads.search.zzb zza(com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder r0) {
                com.google.android.gms.ads.search.zzb r0 = r0.zza
                return r0
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder addCustomEventExtrasBundle(java.lang.Class<? extends com.google.android.gms.ads.mediation.customevent.CustomEvent> r2, android.os.Bundle r3) {
                r1 = this;
                com.google.android.gms.ads.search.zzb r0 = r1.zza
                r0.zzb(r2, r3)
                return r1
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder addNetworkExtras(com.google.android.gms.ads.mediation.NetworkExtras r2) {
                r1 = this;
                com.google.android.gms.ads.search.zzb r0 = r1.zza
                r0.zzc(r2)
                return r1
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder addNetworkExtrasBundle(java.lang.Class<? extends com.google.android.gms.ads.mediation.MediationAdapter> r2, android.os.Bundle r3) {
                r1 = this;
                com.google.android.gms.ads.search.zzb r0 = r1.zza
                r0.zzd(r2, r3)
                return r1
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest build() {
                r3 = this;
                com.google.android.gms.ads.search.zzb r0 = r3.zza
                java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r1 = com.google.ads.mediation.admob.AdMobAdapter.class
                android.os.Bundle r2 = r3.zzb
                r0.zzd(r1, r2)
                com.google.android.gms.ads.search.DynamicHeightSearchAdRequest r0 = new com.google.android.gms.ads.search.DynamicHeightSearchAdRequest
                r1 = 0
                r0.<init>(r3, r1)
                return r0
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setAdBorderSelectors(java.lang.String r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r1 = "csa_adBorderSelectors"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setAdTest(boolean r3) {
                r2 = this;
                r0 = 1
                if (r0 == r3) goto L6
                java.lang.String r3 = "off"
                goto L8
            L6:
                java.lang.String r3 = "on"
            L8:
                android.os.Bundle r0 = r2.zzb
                java.lang.String r1 = "csa_adtest"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setAdjustableLineHeight(int r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r3 = java.lang.Integer.toString(r3)
                java.lang.String r1 = "csa_adjustableLineHeight"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setAdvancedOptionValue(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                android.os.Bundle r0 = r1.zzb
                r0.putString(r2, r3)
                return r1
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setAttributionSpacingBelow(int r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r3 = java.lang.Integer.toString(r3)
                java.lang.String r1 = "csa_attributionSpacingBelow"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setBorderSelections(java.lang.String r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r1 = "csa_borderSelections"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setChannel(java.lang.String r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r1 = "csa_channel"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setColorAdBorder(java.lang.String r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r1 = "csa_colorAdBorder"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setColorAdSeparator(java.lang.String r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r1 = "csa_colorAdSeparator"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setColorAnnotation(java.lang.String r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r1 = "csa_colorAnnotation"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setColorAttribution(java.lang.String r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r1 = "csa_colorAttribution"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setColorBackground(java.lang.String r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r1 = "csa_colorBackground"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setColorBorder(java.lang.String r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r1 = "csa_colorBorder"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setColorDomainLink(java.lang.String r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r1 = "csa_colorDomainLink"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setColorText(java.lang.String r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r1 = "csa_colorText"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setColorTitleLink(java.lang.String r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r1 = "csa_colorTitleLink"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setCssWidth(int r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r3 = java.lang.Integer.toString(r3)
                java.lang.String r1 = "csa_width"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setDetailedAttribution(boolean r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r3 = java.lang.Boolean.toString(r3)
                java.lang.String r1 = "csa_detailedAttribution"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setFontFamily(java.lang.String r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r1 = "csa_fontFamily"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setFontFamilyAttribution(java.lang.String r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r1 = "csa_fontFamilyAttribution"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setFontSizeAnnotation(int r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r3 = java.lang.Integer.toString(r3)
                java.lang.String r1 = "csa_fontSizeAnnotation"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setFontSizeAttribution(int r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r3 = java.lang.Integer.toString(r3)
                java.lang.String r1 = "csa_fontSizeAttribution"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setFontSizeDescription(int r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r3 = java.lang.Integer.toString(r3)
                java.lang.String r1 = "csa_fontSizeDescription"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setFontSizeDomainLink(int r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r3 = java.lang.Integer.toString(r3)
                java.lang.String r1 = "csa_fontSizeDomainLink"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setFontSizeTitle(int r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r3 = java.lang.Integer.toString(r3)
                java.lang.String r1 = "csa_fontSizeTitle"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setHostLanguage(java.lang.String r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r1 = "csa_hl"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setIsClickToCallEnabled(boolean r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r3 = java.lang.Boolean.toString(r3)
                java.lang.String r1 = "csa_clickToCall"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setIsLocationEnabled(boolean r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r3 = java.lang.Boolean.toString(r3)
                java.lang.String r1 = "csa_location"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setIsPlusOnesEnabled(boolean r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r3 = java.lang.Boolean.toString(r3)
                java.lang.String r1 = "csa_plusOnes"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setIsSellerRatingsEnabled(boolean r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r3 = java.lang.Boolean.toString(r3)
                java.lang.String r1 = "csa_sellerRatings"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setIsSiteLinksEnabled(boolean r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r3 = java.lang.Boolean.toString(r3)
                java.lang.String r1 = "csa_siteLinks"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setIsTitleBold(boolean r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r3 = java.lang.Boolean.toString(r3)
                java.lang.String r1 = "csa_titleBold"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setIsTitleUnderlined(boolean r3) {
                r2 = this;
                r3 = r3 ^ 1
                android.os.Bundle r0 = r2.zzb
                java.lang.String r3 = java.lang.Boolean.toString(r3)
                java.lang.String r1 = "csa_noTitleUnderline"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setLocationColor(java.lang.String r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r1 = "csa_colorLocation"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setLocationFontSize(int r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r3 = java.lang.Integer.toString(r3)
                java.lang.String r1 = "csa_fontSizeLocation"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setLongerHeadlines(boolean r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r3 = java.lang.Boolean.toString(r3)
                java.lang.String r1 = "csa_longerHeadlines"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setNumber(int r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r3 = java.lang.Integer.toString(r3)
                java.lang.String r1 = "csa_number"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setPage(int r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r3 = java.lang.Integer.toString(r3)
                java.lang.String r1 = "csa_adPage"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setQuery(java.lang.String r2) {
                r1 = this;
                com.google.android.gms.ads.search.zzb r0 = r1.zza
                r0.zze(r2)
                return r1
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setStyleId(java.lang.String r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r1 = "csa_styleId"
                r0.putString(r1, r3)
                return r2
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setVerticalSpacing(int r3) {
                r2 = this;
                android.os.Bundle r0 = r2.zzb
                java.lang.String r3 = java.lang.Integer.toString(r3)
                java.lang.String r1 = "csa_verticalSpacing"
                r0.putString(r1, r3)
                return r2
        }
    }

    /* synthetic */ DynamicHeightSearchAdRequest(com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder r2, com.google.android.gms.ads.search.zza r3) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.ads.search.zzb r2 = com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder.zza(r2)
            com.google.android.gms.ads.search.SearchAdRequest r3 = new com.google.android.gms.ads.search.SearchAdRequest
            r0 = 0
            r3.<init>(r2, r0)
            r1.zza = r3
            return
    }

    public <T extends com.google.android.gms.ads.mediation.customevent.CustomEvent> android.os.Bundle getCustomEventExtrasBundle(java.lang.Class<T> r2) {
            r1 = this;
            com.google.android.gms.ads.search.SearchAdRequest r0 = r1.zza
            android.os.Bundle r2 = r0.getCustomEventExtrasBundle(r2)
            return r2
    }

    public <T extends com.google.android.gms.ads.mediation.MediationAdapter> android.os.Bundle getNetworkExtrasBundle(java.lang.Class<T> r2) {
            r1 = this;
            com.google.android.gms.ads.search.SearchAdRequest r0 = r1.zza
            android.os.Bundle r2 = r0.getNetworkExtrasBundle(r2)
            return r2
    }

    public java.lang.String getQuery() {
            r1 = this;
            com.google.android.gms.ads.search.SearchAdRequest r0 = r1.zza
            java.lang.String r0 = r0.getQuery()
            return r0
    }

    public boolean isTestDevice(android.content.Context r2) {
            r1 = this;
            com.google.android.gms.ads.search.SearchAdRequest r0 = r1.zza
            boolean r2 = r0.isTestDevice(r2)
            return r2
    }

    final com.google.android.gms.ads.internal.client.zzei zza() {
            r1 = this;
            com.google.android.gms.ads.search.SearchAdRequest r0 = r1.zza
            com.google.android.gms.ads.internal.client.zzei r0 = r0.zza()
            return r0
    }
}
