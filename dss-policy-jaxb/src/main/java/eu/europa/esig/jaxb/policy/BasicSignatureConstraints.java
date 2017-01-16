//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.16 at 10:27:52 AM CET 
//


package eu.europa.esig.jaxb.policy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasicSignatureConstraints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicSignatureConstraints">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenceDataExistence" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/>
 *         &lt;element name="ReferenceDataIntact" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/>
 *         &lt;element name="SignatureIntact" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/>
 *         &lt;element name="SignatureValid" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/>
 *         &lt;element name="ProspectiveCertificateChain" type="{http://dss.esig.europa.eu/validation/policy}LevelConstraint" minOccurs="0"/>
 *         &lt;element name="TrustedServiceTypeIdentifier" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/>
 *         &lt;element name="TrustedServiceStatus" type="{http://dss.esig.europa.eu/validation/policy}MultiValuesConstraint" minOccurs="0"/>
 *         &lt;element name="SigningCertificate" type="{http://dss.esig.europa.eu/validation/policy}CertificateConstraints" minOccurs="0"/>
 *         &lt;element name="CACertificate" type="{http://dss.esig.europa.eu/validation/policy}CertificateConstraints" minOccurs="0"/>
 *         &lt;element name="Cryptographic" type="{http://dss.esig.europa.eu/validation/policy}CryptographicConstraint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicSignatureConstraints", propOrder = {
    "referenceDataExistence",
    "referenceDataIntact",
    "signatureIntact",
    "signatureValid",
    "prospectiveCertificateChain",
    "trustedServiceTypeIdentifier",
    "trustedServiceStatus",
    "signingCertificate",
    "caCertificate",
    "cryptographic"
})
public class BasicSignatureConstraints {

    @XmlElement(name = "ReferenceDataExistence")
    protected LevelConstraint referenceDataExistence;
    @XmlElement(name = "ReferenceDataIntact")
    protected LevelConstraint referenceDataIntact;
    @XmlElement(name = "SignatureIntact")
    protected LevelConstraint signatureIntact;
    @XmlElement(name = "SignatureValid")
    protected LevelConstraint signatureValid;
    @XmlElement(name = "ProspectiveCertificateChain")
    protected LevelConstraint prospectiveCertificateChain;
    @XmlElement(name = "TrustedServiceTypeIdentifier")
    protected MultiValuesConstraint trustedServiceTypeIdentifier;
    @XmlElement(name = "TrustedServiceStatus")
    protected MultiValuesConstraint trustedServiceStatus;
    @XmlElement(name = "SigningCertificate")
    protected CertificateConstraints signingCertificate;
    @XmlElement(name = "CACertificate")
    protected CertificateConstraints caCertificate;
    @XmlElement(name = "Cryptographic")
    protected CryptographicConstraint cryptographic;

    /**
     * Gets the value of the referenceDataExistence property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getReferenceDataExistence() {
        return referenceDataExistence;
    }

    /**
     * Sets the value of the referenceDataExistence property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setReferenceDataExistence(LevelConstraint value) {
        this.referenceDataExistence = value;
    }

    /**
     * Gets the value of the referenceDataIntact property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getReferenceDataIntact() {
        return referenceDataIntact;
    }

    /**
     * Sets the value of the referenceDataIntact property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setReferenceDataIntact(LevelConstraint value) {
        this.referenceDataIntact = value;
    }

    /**
     * Gets the value of the signatureIntact property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getSignatureIntact() {
        return signatureIntact;
    }

    /**
     * Sets the value of the signatureIntact property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setSignatureIntact(LevelConstraint value) {
        this.signatureIntact = value;
    }

    /**
     * Gets the value of the signatureValid property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getSignatureValid() {
        return signatureValid;
    }

    /**
     * Sets the value of the signatureValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setSignatureValid(LevelConstraint value) {
        this.signatureValid = value;
    }

    /**
     * Gets the value of the prospectiveCertificateChain property.
     * 
     * @return
     *     possible object is
     *     {@link LevelConstraint }
     *     
     */
    public LevelConstraint getProspectiveCertificateChain() {
        return prospectiveCertificateChain;
    }

    /**
     * Sets the value of the prospectiveCertificateChain property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelConstraint }
     *     
     */
    public void setProspectiveCertificateChain(LevelConstraint value) {
        this.prospectiveCertificateChain = value;
    }

    /**
     * Gets the value of the trustedServiceTypeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getTrustedServiceTypeIdentifier() {
        return trustedServiceTypeIdentifier;
    }

    /**
     * Sets the value of the trustedServiceTypeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setTrustedServiceTypeIdentifier(MultiValuesConstraint value) {
        this.trustedServiceTypeIdentifier = value;
    }

    /**
     * Gets the value of the trustedServiceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public MultiValuesConstraint getTrustedServiceStatus() {
        return trustedServiceStatus;
    }

    /**
     * Sets the value of the trustedServiceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiValuesConstraint }
     *     
     */
    public void setTrustedServiceStatus(MultiValuesConstraint value) {
        this.trustedServiceStatus = value;
    }

    /**
     * Gets the value of the signingCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateConstraints }
     *     
     */
    public CertificateConstraints getSigningCertificate() {
        return signingCertificate;
    }

    /**
     * Sets the value of the signingCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateConstraints }
     *     
     */
    public void setSigningCertificate(CertificateConstraints value) {
        this.signingCertificate = value;
    }

    /**
     * Gets the value of the caCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateConstraints }
     *     
     */
    public CertificateConstraints getCACertificate() {
        return caCertificate;
    }

    /**
     * Sets the value of the caCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateConstraints }
     *     
     */
    public void setCACertificate(CertificateConstraints value) {
        this.caCertificate = value;
    }

    /**
     * Gets the value of the cryptographic property.
     * 
     * @return
     *     possible object is
     *     {@link CryptographicConstraint }
     *     
     */
    public CryptographicConstraint getCryptographic() {
        return cryptographic;
    }

    /**
     * Sets the value of the cryptographic property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptographicConstraint }
     *     
     */
    public void setCryptographic(CryptographicConstraint value) {
        this.cryptographic = value;
    }

}
