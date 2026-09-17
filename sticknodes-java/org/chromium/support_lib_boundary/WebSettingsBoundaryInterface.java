package org.chromium.support_lib_boundary;

/* loaded from: classes2.dex */
public interface WebSettingsBoundaryInterface {

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AttributionBehavior {
        public static final int APP_SOURCE_AND_APP_TRIGGER = 3;
        public static final int APP_SOURCE_AND_WEB_TRIGGER = 1;
        public static final int DISABLED = 0;
        public static final int WEB_SOURCE_AND_WEB_TRIGGER = 2;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ForceDarkBehavior {
        public static final int FORCE_DARK_ONLY = 0;
        public static final int MEDIA_QUERY_ONLY = 1;
        public static final int PREFER_MEDIA_QUERY_OVER_FORCE_DARK = 2;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface WebAuthnSupport {
        public static final int APP = 1;
        public static final int BROWSER = 2;
        public static final int NONE = 0;
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface WebViewMediaIntegrityApiStatus {
        public static final int DISABLED = 0;
        public static final int ENABLED = 2;
        public static final int ENABLED_WITHOUT_APP_IDENTITY = 1;
    }

    int getAttributionBehavior();

    int getDisabledActionModeMenuItems();

    boolean getEnterpriseAuthenticationAppLinkPolicyEnabled();

    int getForceDark();

    int getForceDarkBehavior();

    boolean getOffscreenPreRaster();

    java.util.Set<java.lang.String> getRequestedWithHeaderOriginAllowList();

    boolean getSafeBrowsingEnabled();

    java.util.Map<java.lang.String, java.lang.Object> getUserAgentMetadataMap();

    int getWebAuthnSupport();

    int getWebViewMediaIntegrityApiDefaultStatus();

    java.util.Map<java.lang.String, java.lang.Integer> getWebViewMediaIntegrityApiOverrideRules();

    boolean getWillSuppressErrorPage();

    boolean isAlgorithmicDarkeningAllowed();

    void setAlgorithmicDarkeningAllowed(boolean r1);

    void setAttributionBehavior(int r1);

    void setDisabledActionModeMenuItems(int r1);

    void setEnterpriseAuthenticationAppLinkPolicyEnabled(boolean r1);

    void setForceDark(int r1);

    void setForceDarkBehavior(int r1);

    void setOffscreenPreRaster(boolean r1);

    void setRequestedWithHeaderOriginAllowList(java.util.Set<java.lang.String> r1);

    void setSafeBrowsingEnabled(boolean r1);

    void setUserAgentMetadataFromMap(java.util.Map<java.lang.String, java.lang.Object> r1);

    void setWebAuthnSupport(int r1);

    void setWebViewMediaIntegrityApiStatus(int r1, java.util.Map<java.lang.String, java.lang.Integer> r2);

    void setWillSuppressErrorPage(boolean r1);
}
