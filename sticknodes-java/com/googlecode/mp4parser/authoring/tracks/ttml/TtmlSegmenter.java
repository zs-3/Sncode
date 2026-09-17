package com.googlecode.mp4parser.authoring.tracks.ttml;

/* loaded from: classes2.dex */
public class TtmlSegmenter {
    public TtmlSegmenter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void changeTime(org.w3c.dom.Node r5, java.lang.String r6, long r7) {
            org.w3c.dom.NamedNodeMap r0 = r5.getAttributes()
            if (r0 == 0) goto L45
            org.w3c.dom.NamedNodeMap r0 = r5.getAttributes()
            org.w3c.dom.Node r0 = r0.getNamedItem(r6)
            if (r0 == 0) goto L45
            org.w3c.dom.NamedNodeMap r0 = r5.getAttributes()
            org.w3c.dom.Node r0 = r0.getNamedItem(r6)
            java.lang.String r0 = r0.getNodeValue()
            long r1 = com.googlecode.mp4parser.authoring.tracks.ttml.TtmlHelpers.toTime(r0)
            long r1 = r1 + r7
            java.lang.String r7 = "."
            boolean r7 = r0.contains(r7)
            if (r7 == 0) goto L2b
            r7 = -1
            goto L36
        L2b:
            r7 = 1000(0x3e8, double:4.94E-321)
            long r3 = r1 / r7
            long r3 = r3 * r7
            long r7 = r1 - r3
            int r8 = (int) r7
            int r7 = r8 / 44
        L36:
            org.w3c.dom.NamedNodeMap r5 = r5.getAttributes()
            org.w3c.dom.Node r5 = r5.getNamedItem(r6)
            java.lang.String r6 = com.googlecode.mp4parser.authoring.tracks.ttml.TtmlHelpers.toTimeExpression(r1, r7)
            r5.setNodeValue(r6)
        L45:
            return
    }

    public static org.w3c.dom.Document normalizeTimes(org.w3c.dom.Document r4) throws javax.xml.xpath.XPathExpressionException {
            javax.xml.xpath.XPathFactory r0 = javax.xml.xpath.XPathFactory.newInstance()
            javax.xml.xpath.XPath r0 = r0.newXPath()
            javax.xml.namespace.NamespaceContext r1 = com.googlecode.mp4parser.authoring.tracks.ttml.TtmlHelpers.NAMESPACE_CONTEXT
            r0.setNamespaceContext(r1)
            java.lang.String r1 = "//*[name()='p']"
            javax.xml.xpath.XPathExpression r0 = r0.compile(r1)
            javax.xml.namespace.QName r1 = javax.xml.xpath.XPathConstants.NODESET
            java.lang.Object r0 = r0.evaluate(r4, r1)
            org.w3c.dom.NodeList r0 = (org.w3c.dom.NodeList) r0
            r1 = 0
            r2 = 0
        L1d:
            int r3 = r0.getLength()
            if (r2 < r3) goto L3b
        L23:
            int r2 = r0.getLength()
            if (r1 < r2) goto L2a
            return r4
        L2a:
            org.w3c.dom.Node r2 = r0.item(r1)
            java.lang.String r3 = "begin"
            removeAfterPushDown(r2, r3)
            java.lang.String r3 = "end"
            removeAfterPushDown(r2, r3)
            int r1 = r1 + 1
            goto L23
        L3b:
            org.w3c.dom.Node r3 = r0.item(r2)
            pushDown(r3)
            int r2 = r2 + 1
            goto L1d
    }

    private static void pushDown(org.w3c.dom.Node r5) {
            r0 = 0
            r2 = r5
        L3:
            org.w3c.dom.Node r2 = r2.getParentNode()
            java.lang.String r3 = "begin"
            if (r2 != 0) goto L6e
            org.w3c.dom.NamedNodeMap r2 = r5.getAttributes()
            if (r2 == 0) goto L3b
            org.w3c.dom.NamedNodeMap r2 = r5.getAttributes()
            org.w3c.dom.Node r2 = r2.getNamedItem(r3)
            if (r2 == 0) goto L3b
            org.w3c.dom.NamedNodeMap r2 = r5.getAttributes()
            org.w3c.dom.Node r2 = r2.getNamedItem(r3)
            org.w3c.dom.NamedNodeMap r4 = r5.getAttributes()
            org.w3c.dom.Node r3 = r4.getNamedItem(r3)
            java.lang.String r3 = r3.getNodeValue()
            long r3 = com.googlecode.mp4parser.authoring.tracks.ttml.TtmlHelpers.toTime(r3)
            long r3 = r3 + r0
            java.lang.String r3 = com.googlecode.mp4parser.authoring.tracks.ttml.TtmlHelpers.toTimeExpression(r3)
            r2.setNodeValue(r3)
        L3b:
            org.w3c.dom.NamedNodeMap r2 = r5.getAttributes()
            if (r2 == 0) goto L6d
            org.w3c.dom.NamedNodeMap r2 = r5.getAttributes()
            java.lang.String r3 = "end"
            org.w3c.dom.Node r2 = r2.getNamedItem(r3)
            if (r2 == 0) goto L6d
            org.w3c.dom.NamedNodeMap r2 = r5.getAttributes()
            org.w3c.dom.Node r2 = r2.getNamedItem(r3)
            org.w3c.dom.NamedNodeMap r5 = r5.getAttributes()
            org.w3c.dom.Node r5 = r5.getNamedItem(r3)
            java.lang.String r5 = r5.getNodeValue()
            long r3 = com.googlecode.mp4parser.authoring.tracks.ttml.TtmlHelpers.toTime(r5)
            long r0 = r0 + r3
            java.lang.String r5 = com.googlecode.mp4parser.authoring.tracks.ttml.TtmlHelpers.toTimeExpression(r0)
            r2.setNodeValue(r5)
        L6d:
            return
        L6e:
            org.w3c.dom.NamedNodeMap r4 = r2.getAttributes()
            if (r4 == 0) goto L3
            org.w3c.dom.NamedNodeMap r4 = r2.getAttributes()
            org.w3c.dom.Node r4 = r4.getNamedItem(r3)
            if (r4 == 0) goto L3
            org.w3c.dom.NamedNodeMap r4 = r2.getAttributes()
            org.w3c.dom.Node r3 = r4.getNamedItem(r3)
            java.lang.String r3 = r3.getNodeValue()
            long r3 = com.googlecode.mp4parser.authoring.tracks.ttml.TtmlHelpers.toTime(r3)
            long r0 = r0 + r3
            goto L3
    }

    private static void removeAfterPushDown(org.w3c.dom.Node r1, java.lang.String r2) {
        L0:
            org.w3c.dom.Node r1 = r1.getParentNode()
            if (r1 != 0) goto L7
            return
        L7:
            org.w3c.dom.NamedNodeMap r0 = r1.getAttributes()
            if (r0 == 0) goto L0
            org.w3c.dom.NamedNodeMap r0 = r1.getAttributes()
            org.w3c.dom.Node r0 = r0.getNamedItem(r2)
            if (r0 == 0) goto L0
            org.w3c.dom.NamedNodeMap r0 = r1.getAttributes()
            r0.removeNamedItem(r2)
            goto L0
    }

    public static java.util.List<org.w3c.dom.Document> split(org.w3c.dom.Document r22, int r23) throws javax.xml.xpath.XPathExpressionException {
            r0 = r23
            int r0 = r0 * 1000
            javax.xml.xpath.XPathFactory r1 = javax.xml.xpath.XPathFactory.newInstance()
            javax.xml.xpath.XPath r1 = r1.newXPath()
            java.lang.String r2 = "//*[name()='p']"
            javax.xml.xpath.XPathExpression r2 = r1.compile(r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L17:
            int r4 = r3.size()
            int r4 = r4 * r0
            long r4 = (long) r4
            int r6 = r3.size()
            r7 = 1
            int r6 = r6 + r7
            int r6 = r6 * r0
            long r8 = (long) r6
            r6 = r22
            org.w3c.dom.Node r10 = r6.cloneNode(r7)
            org.w3c.dom.Document r10 = (org.w3c.dom.Document) r10
            javax.xml.namespace.QName r11 = javax.xml.xpath.XPathConstants.NODESET
            java.lang.Object r11 = r2.evaluate(r10, r11)
            org.w3c.dom.NodeList r11 = (org.w3c.dom.NodeList) r11
            r12 = 0
            r13 = 0
        L39:
            int r14 = r11.getLength()
            java.lang.String r15 = "end"
            java.lang.String r7 = "begin"
            if (r12 < r14) goto L91
            trimWhitespace(r10)
            java.lang.String r11 = "/*[name()='tt']/*[name()='body'][1]"
            javax.xml.xpath.XPathExpression r11 = r1.compile(r11)
            javax.xml.namespace.QName r12 = javax.xml.xpath.XPathConstants.NODE
            java.lang.Object r11 = r11.evaluate(r10, r12)
            org.w3c.dom.Element r11 = (org.w3c.dom.Element) r11
            java.lang.String r12 = r11.getAttribute(r7)
            java.lang.String r14 = r11.getAttribute(r15)
            r16 = r0
            java.lang.String r0 = ""
            if (r12 == 0) goto L6d
            boolean r12 = r0.equals(r12)
            if (r12 == 0) goto L69
            goto L6d
        L69:
            changeTime(r11, r7, r4)
            goto L74
        L6d:
            java.lang.String r4 = com.googlecode.mp4parser.authoring.tracks.ttml.TtmlHelpers.toTimeExpression(r4)
            r11.setAttribute(r7, r4)
        L74:
            if (r14 == 0) goto L81
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L7d
            goto L81
        L7d:
            changeTime(r11, r15, r8)
            goto L88
        L81:
            java.lang.String r0 = com.googlecode.mp4parser.authoring.tracks.ttml.TtmlHelpers.toTimeExpression(r8)
            r11.setAttribute(r15, r0)
        L88:
            r3.add(r10)
            if (r13 != 0) goto L8e
            return r3
        L8e:
            r0 = r16
            goto L17
        L91:
            r16 = r0
            org.w3c.dom.Node r0 = r11.item(r12)
            long r17 = com.googlecode.mp4parser.authoring.tracks.ttml.TtmlHelpers.getStartTime(r0)
            long r19 = com.googlecode.mp4parser.authoring.tracks.ttml.TtmlHelpers.getEndTime(r0)
            int r14 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r14 >= 0) goto Lb2
            int r14 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r14 <= 0) goto Lb2
            r14 = r1
            r21 = r2
            long r1 = r4 - r17
            changeTime(r0, r7, r1)
            r17 = r4
            goto Lb5
        Lb2:
            r14 = r1
            r21 = r2
        Lb5:
            int r1 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r1 < 0) goto Lca
            int r1 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
            if (r1 >= 0) goto Lca
            int r1 = (r19 > r8 ? 1 : (r19 == r8 ? 0 : -1))
            if (r1 <= 0) goto Lca
            long r1 = r8 - r19
            changeTime(r0, r15, r1)
            r17 = r4
            r19 = r8
        Lca:
            int r1 = (r17 > r8 ? 1 : (r17 == r8 ? 0 : -1))
            if (r1 <= 0) goto Lcf
            r13 = 1
        Lcf:
            int r1 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r1 < 0) goto Le0
            int r1 = (r19 > r8 ? 1 : (r19 == r8 ? 0 : -1))
            if (r1 <= 0) goto Ld8
            goto Le0
        Ld8:
            long r1 = -r4
            changeTime(r0, r7, r1)
            changeTime(r0, r15, r1)
            goto Le7
        Le0:
            org.w3c.dom.Node r1 = r0.getParentNode()
            r1.removeChild(r0)
        Le7:
            int r12 = r12 + 1
            r1 = r14
            r0 = r16
            r2 = r21
            r7 = 1
            goto L39
    }

    public static void trimWhitespace(org.w3c.dom.Node r4) {
            org.w3c.dom.NodeList r4 = r4.getChildNodes()
            r0 = 0
        L5:
            int r1 = r4.getLength()
            if (r0 < r1) goto Lc
            return
        Lc:
            org.w3c.dom.Node r1 = r4.item(r0)
            short r2 = r1.getNodeType()
            r3 = 3
            if (r2 != r3) goto L22
            java.lang.String r2 = r1.getTextContent()
            java.lang.String r2 = r2.trim()
            r1.setTextContent(r2)
        L22:
            trimWhitespace(r1)
            int r0 = r0 + 1
            goto L5
    }
}
