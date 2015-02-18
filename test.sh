rm $CATALINA_BASE/webapps/eBay.war
rm -r $CATALINA_BASE/webapps/eBay

ant build
cd build
cp eBay.war $CATALINA_BASE/webapps