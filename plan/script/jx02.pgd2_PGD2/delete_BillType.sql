DELETE FROM bd_billtype2 WHERE pk_billtypeid = '0001ZZ100000000CDXST';
DELETE FROM bd_fwdbilltype WHERE pk_billtypeid = '0001ZZ100000000CDXST';
DELETE FROM pub_function WHERE pk_billtype = 'JX02';
DELETE FROM pub_billaction WHERE pk_billtypeid = '0001ZZ100000000CDXST';
DELETE FROM pub_billactiongroup WHERE pk_billtype = 'JX02';
DELETE FROM bd_billtype WHERE pk_billtypeid = '0001ZZ100000000CDXST';
delete from temppkts;
DELETE FROM sm_rule_type WHERE pk_rule_type = null;
DELETE FROM sm_permission_res WHERE pk_permission_res = null;
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000CDXSU';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000CDXSV';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000CDXSW';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000CDXSX';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000CDXSY';
DELETE FROM pub_billaction WHERE pk_billaction = '0001ZZ100000000CDXSZ';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000CDXT0';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000CDXT1';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000CDXT2';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000CDXT3';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000CDXT4';
DELETE FROM pub_busiclass WHERE pk_busiclass = '0001ZZ100000000CDXT5';