package com.googlecode.mp4parser;

/* loaded from: classes2.dex */
public class RequiresParseDetailAspect {
    private static /* synthetic */ java.lang.Throwable ajc$initFailureCause;
    public static final /* synthetic */ com.googlecode.mp4parser.RequiresParseDetailAspect ajc$perSingletonInstance = null;

    static {
            ajc$postClinit()     // Catch: java.lang.Throwable -> L4
            goto L7
        L4:
            r0 = move-exception
            com.googlecode.mp4parser.RequiresParseDetailAspect.ajc$initFailureCause = r0
        L7:
            return
    }

    public RequiresParseDetailAspect() {
            r0 = this;
            r0.<init>()
            return
    }

    private static /* synthetic */ void ajc$postClinit() {
            com.googlecode.mp4parser.RequiresParseDetailAspect r0 = new com.googlecode.mp4parser.RequiresParseDetailAspect
            r0.<init>()
            com.googlecode.mp4parser.RequiresParseDetailAspect.ajc$perSingletonInstance = r0
            return
    }

    public static com.googlecode.mp4parser.RequiresParseDetailAspect aspectOf() {
            com.googlecode.mp4parser.RequiresParseDetailAspect r0 = com.googlecode.mp4parser.RequiresParseDetailAspect.ajc$perSingletonInstance
            if (r0 == 0) goto L5
            return r0
        L5:
            org.mp4parser.aspectj.lang.NoAspectBoundException r0 = new org.mp4parser.aspectj.lang.NoAspectBoundException
            java.lang.Throwable r1 = com.googlecode.mp4parser.RequiresParseDetailAspect.ajc$initFailureCause
            java.lang.String r2 = "com.googlecode.mp4parser.RequiresParseDetailAspect"
            r0.<init>(r2, r1)
            throw r0
    }

    public static boolean hasAspect() {
            com.googlecode.mp4parser.RequiresParseDetailAspect r0 = com.googlecode.mp4parser.RequiresParseDetailAspect.ajc$perSingletonInstance
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public void before(org.mp4parser.aspectj.lang.JoinPoint r3) {
            r2 = this;
            java.lang.Object r0 = r3.getTarget()
            boolean r0 = r0 instanceof com.googlecode.mp4parser.AbstractBox
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r3.getTarget()
            com.googlecode.mp4parser.AbstractBox r0 = (com.googlecode.mp4parser.AbstractBox) r0
            boolean r0 = r0.isParsed()
            if (r0 != 0) goto L1d
            java.lang.Object r3 = r3.getTarget()
            com.googlecode.mp4parser.AbstractBox r3 = (com.googlecode.mp4parser.AbstractBox) r3
            r3.parseDetails()
        L1d:
            return
        L1e:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Only methods in subclasses of "
            r0.<init>(r1)
            java.lang.Class<com.googlecode.mp4parser.AbstractBox> r1 = com.googlecode.mp4parser.AbstractBox.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = " can  be annotated with ParseDetail"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }
}
