package kotlin.text;

/* compiled from: Charsets.kt */
/* loaded from: classes2.dex */
public final class Charsets {
    public static final kotlin.text.Charsets INSTANCE = null;
    public static final java.nio.charset.Charset ISO_8859_1 = null;
    public static final java.nio.charset.Charset US_ASCII = null;
    public static final java.nio.charset.Charset UTF_16 = null;
    public static final java.nio.charset.Charset UTF_16BE = null;
    public static final java.nio.charset.Charset UTF_16LE = null;
    public static final java.nio.charset.Charset UTF_8 = null;

    static {
            kotlin.text.Charsets r0 = new kotlin.text.Charsets
            r0.<init>()
            kotlin.text.Charsets.INSTANCE = r0
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            java.lang.String r1 = "forName(\"UTF-8\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            kotlin.text.Charsets.UTF_8 = r0
            java.lang.String r0 = "UTF-16"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            java.lang.String r1 = "forName(\"UTF-16\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            kotlin.text.Charsets.UTF_16 = r0
            java.lang.String r0 = "UTF-16BE"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            java.lang.String r1 = "forName(\"UTF-16BE\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            kotlin.text.Charsets.UTF_16BE = r0
            java.lang.String r0 = "UTF-16LE"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            java.lang.String r1 = "forName(\"UTF-16LE\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            kotlin.text.Charsets.UTF_16LE = r0
            java.lang.String r0 = "US-ASCII"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            java.lang.String r1 = "forName(\"US-ASCII\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            kotlin.text.Charsets.US_ASCII = r0
            java.lang.String r0 = "ISO-8859-1"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            java.lang.String r1 = "forName(\"ISO-8859-1\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            kotlin.text.Charsets.ISO_8859_1 = r0
            return
    }

    private Charsets() {
            r0 = this;
            r0.<init>()
            return
    }
}
